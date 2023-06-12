var imagesDir = "./images/";
var projectDir = "./images/";
var originalDoc;
try {
    originalDoc = app.activeDocument;
} catch (ignored) {
}

showDialog();

function run() {
    // Output dirs.
    var absProjectDir = absolutePath(projectDir);
    new Folder(absProjectDir).create();
    var absImagesDir = absolutePath(imagesDir);
    var imagesFolder = new Folder(absImagesDir);
    imagesFolder.create();
    var relImagesDir = imagesFolder.getRelativeURI(absProjectDir);
    relImagesDir = relImagesDir == "." ? "" : (relImagesDir + "/");
    activeDocument.duplicate();
    // Rasterize all layers.
    try {
        executeAction(stringIDToTypeID("rasterizeAll"), undefined, DialogModes.NO);
    } catch (ignored) {
    }

    // Collect and hide layers.
    var layers = [];
    collectLayers(activeDocument, layers);
    var layersCount = layers.length;
    storeHistory();
    var json = '{"skeleton":{"images":"' + relImagesDir + '"},\n"bones":[{"name":"root"}],\n"slots":[\n';
    var json1 = "";
    var json2 = "";
    var slt = {};
    // Store the slot names and layers for each skin.
    for (var i = layersCount - 1; i >= 0; i--) {
        var layer = layers[i];

        var name = layerName(layer).substr(0, 10);

        var idx = 1;
        var savename = name.toLowerCase();
        while (slt[savename]) {
            savename = name + "_" + idx;
            idx++;
        }
        slt[savename] = true;

        //alert(savename);

        json1 += '\t{"name":"' + savename + '","bone":"root","attachment":"' + savename + '"}';
        if (i == 0)
            json1 += "\n";
        else
            json1 += ",\n";

        var x = activeDocument.width.as("px");
        var y = activeDocument.height.as("px");

        layer.visible = true;
        if (!layer.isBackgroundLayer) activeDocument.trim(TrimType.TRANSPARENT, false, true, true, false);
        x -= activeDocument.width.as("px");
        y -= activeDocument.height.as("px");
        if (!layer.isBackgroundLayer) activeDocument.trim(TrimType.TRANSPARENT, true, false, false, true);
        var width = activeDocument.width.as("px");
        var height = activeDocument.height.as("px");

        // Save image.
        //activeDocument.saveAs(new File(absImagesDir + savename), new PNGSaveOptions(), true, Extension.LOWERCASE);

		var opts, file;
        opts = new ExportOptionsSaveForWeb();
        opts.format = SaveDocumentType.PNG;
        opts.PNG8 = false;
        opts.quality = 100;

        pngFile = new File(absImagesDir + savename+".png");
        activeDocument.exportDocument(pngFile, ExportType.SAVEFORWEB, opts);
		

        restoreHistory();
        layer.visible = false;

        x += Math.round(width) / 2;
        y += Math.round(height) / 2;

        json2 += '\t\t"' + savename + '":{"' + savename + '":{'
            + '"x":' + x + ',"y":' + y + ',"width":' + Math.round(width) + ',"height":' + Math.round(height) + '}}';

        if (i == 0)
            json2 += "\n";
        else
            json2 += ",\n";
    }

    // Output skeleton and bones.
    var json = '{"skeleton":{"images":"' + relImagesDir + '"},\n"bones":[{"name":"root"}],\n"slots":[\n' + json1 + '],\n"skins":{\n'
        + '"default":{\n' + json2 + '}\n' + '},\n"animations":{"animation":{}}\n}';

    activeDocument.close(SaveOptions.DONOTSAVECHANGES);

    // Output JSON file.
    var name = decodeURI(originalDoc.name);
    name = name.substring(0, name.indexOf("."));
    var file = new File(absProjectDir + name + ".json");
    file.remove();
    file.open("w", "TEXT");
    file.lineFeed = "\n";
    file.write(json);
    file.close();
}

// Dialog and settings:

function showDialog() {
    if (!originalDoc) {
        alert("Please open a document before running the LayersToPNG script.");
        return;
    }
    if (!hasFilePath()) {
        alert("Please save the document before running the LayersToPNG script.");
        return;
    }

    var dialog = new Window("dialog", "Spine LayersToPNG");
    dialog.alignChildren = "fill";

    var group = dialog.add("group");
    group.alignment = "center";
    var runButton = group.add("button", undefined, "OK");
    var cancelButton = group.add("button", undefined, "Cancel");
    cancelButton.onClick = function () {
        dialog.close(0);
        return;
    };

    dialog.onClose = function () {
    };

    runButton.onClick = function () {
        dialog.close(0);

        var rulerUnits = app.preferences.rulerUnits;
        app.preferences.rulerUnits = Units.PIXELS;
        try {
            run();
        } catch (e) {
            alert("An unexpected error has occurred.\n\nTo debug, run the LayersToPNG script using Adobe ExtendScript "
                + "with \"Debug > Do not break on guarded exceptions\" unchecked.");
            debugger;
        } finally {
            if (activeDocument != originalDoc) activeDocument.close(SaveOptions.DONOTSAVECHANGES);
            app.preferences.rulerUnits = rulerUnits;
        }
    };

    dialog.center();
    dialog.show();
}

// Photoshop utility:

var historyIndex;
function storeHistory() {
    historyIndex = activeDocument.historyStates.length - 1;
}
function restoreHistory() {
    activeDocument.activeHistoryState = activeDocument.historyStates[historyIndex];
}

function collectLayers(layer, collect) {
    for (var i = 0, n = layer.layers.length; i < n; i++) {
        var child = layer.layers[i];
        if (!child.visible)
            continue;
        if (child.bounds[2] == 0 && child.bounds[3] == 0) continue;
        if (child.layers && child.layers.length > 0)
            collectLayers(child, collect);
        else if (child.kind == LayerKind.NORMAL) {
            collect.push(child);
            child.visible = false;
        }
    }
}

function hasFilePath() {
    var ref = new ActionReference();
    ref.putEnumerated(charIDToTypeID("Dcmn"), charIDToTypeID("Ordn"), charIDToTypeID("Trgt"));
    return executeActionGet(ref).hasKey(stringIDToTypeID("fileReference"));
}

function absolutePath(path) {
    path = trim(path);
    if (path.length == 0)
        path = activeDocument.path.toString();
    else if (imagesDir.indexOf("./") == 0)
        path = activeDocument.path + path.substring(1);
    path = path.replace(/\\/g, "/");
    if (path.substring(path.length - 1) != "/") path += "/";
    return path;
}

// JavaScript utility:

function trim(value) {
    return value.replace(/^\s+|\s+$/g, "");
    // return value.replace(/[\s\\/:\*\?\.\"<>\|]/g, "_");
}

function endsWith(str, suffix) {
    return str.indexOf(suffix, str.length - suffix.length) !== -1;
}

function stripSuffix(str, suffix) {
    if (endsWith(str.toLowerCase(), suffix.toLowerCase())) str = str.substring(0, str.length - suffix.length);
    return str;
}

function layerName(layer) {
    var reg=new RegExp(" ","g");

    return stripSuffix(trim(layer.name), ".png").replace(/[:\/\\*\?\"\<\>\|\.\%\$]/g, "_").replace(reg,"_");
}
