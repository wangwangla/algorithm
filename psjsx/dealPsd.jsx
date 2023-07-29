var imagesDir = "./images/";
var projectDir = "./images/";

var originalDoc;
try {
    originalDoc = app.activeDocument;
} catch (ignored) {
}

run();
var historyIndex;
function run() {
    // Output dirs.
    var absProjectDir = absolutePath(projectDir);
	//create folder
    new Folder(absProjectDir).create();
	//image folder
    var absImagesDir = absolutePath(imagesDir);
	//
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

    // Collect group.
    var group = [];
    collectGroup(activeDocument, group);
    historyIndex = activeDocument.historyStates.length - 1;
    //get group child
    for (var i = 0, n = group.length; i < n; i++) {
        alert("分组名称："+group[i].name);
        collectLayers(group[i])
    }
}

// Photoshop utility:

var historyIndex;
function storeHistory() {
    historyIndex = activeDocument.historyStates.length - 1;
}
function restoreHistory() {
    activeDocument.activeHistoryState = activeDocument.historyStates[historyIndex];
}

function collectGroup(layer, collect) {
    for (var i = 0, n = layer.layers.length; i < n; i++) {
        var child = layer.layers[i];
        if (!child.visible)
            continue;
        if (child.bounds[2] == 0 && child.bounds[3] == 0) continue;
        if (child.layers && child.layers.length > 0){
            collect.push(child)
            alert("加入数据");
        }//             collectLayers(child, collect);
        else if (child.kind == LayerKind.NORMAL) {
            alert("不是组："+child.name)
            var x = activeDocument.width.as("px");
                      var y = activeDocument.height.as("px");

            if (!child.isBackgroundLayer)
            activeDocument.trim(TrimType.TRANSPARENT, false, true, true, false);
            x -= activeDocument.width.as("px");
            y -= activeDocument.height.as("px");
            if (!child.isBackgroundLayer) activeDocument.trim(TrimType.TRANSPARENT, true, false, false, true);
            var width = activeDocument.width.as("px");
            var height = activeDocument.height.as("px");
            x += Math.round(width) / 2;
            y += Math.round(height) / 2;

            child.visible = true;
             alert("不是组："+child.name+"    "+x+"    "+y+"    "+width+"   "+height)
            child.visible = false;
        }
    }
}


function collectLayers(layer) {
    for (var i = 0, n = layer.layers.length; i < n; i++) {
        var child = layer.layers[i];
        if (!child.visible)
            continue;
        if (child.bounds[2] == 0 && child.bounds[3] == 0) continue;
        if (child.layers && child.layers.length > 0){
//             collect.push(child)
            alert("加入数据");
        }//             collectLayers(child, collect);
        else if (child.kind == LayerKind.NORMAL) {
            var x = activeDocument.width.as("px");
                var y = activeDocument.height.as("px");

            if (!layer.isBackgroundLayer) activeDocument.trim(TrimType.TRANSPARENT, false, true, true, false);
            x -= activeDocument.width.as("px");
            y -= activeDocument.height.as("px");
            if (!layer.isBackgroundLayer) activeDocument.trim(TrimType.TRANSPARENT, true, false, false, true);
            var width = activeDocument.width.as("px");
            var height = activeDocument.height.as("px");

                activeDocument.activeHistoryState = activeDocument.historyStates[historyIndex];

            x += Math.round(width) / 2;
        y += Math.round(height) / 2;

            layer.visible = true;
             alert("不是组："+child.name+"    "+x+"    "+y+"    "+width+"   "+height)
            layer.visible = false;
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
