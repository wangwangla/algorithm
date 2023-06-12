var imagesDir = "./images/";
var projectDir = "./images/";
var table = {};
var numMap = [];
var numMapRe = {};

var grouplayermap = {};

var originalDoc;
try {
    originalDoc = app.activeDocument;
} catch (ignored) {
}

table["一"] = true;
table["二"] = true;
table["三"] = true;
table["四"] = true;
table["五"] = true;
table["六"] = true;
table["七"] = true;
table["八"] = true;
table["九"] = true;

numMapRe["一"] = 1;
numMapRe["二"] = 2;
numMapRe["三"] = 3;
numMapRe["四"] = 4;
numMapRe["五"] = 5;
numMapRe["六"] = 6;
numMapRe["七"] = 7;
numMapRe["八"] = 8;
numMapRe["九"] = 9;


numMap = ["展位",
          "一",
          "二",
          "三",
          "四",
          "五",
          "六",
          "七",
          "八",
          "九"];

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
        alert(group[i].name);
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
            var name = child.name;
            var sub = name.substring(1,2);
            if(table[sub]){
                collect.push(child);
            }
        }
    }
}


function collectLayers(layer) {
    var cengName = layer.name;
    var subCengName = cengName.substring(1,2);
    grouplayermap[cengName] = [];
    for (var i = 0, n = layer.layers.length; i < n; i++) {
        var xx = grouplayermap[cengName];
        var child = layer.layers[i];
        xx.push(child);
        alert(xx);

        if (!child.visible)
            continue;
        if (child.bounds[2] == 0 && child.bounds[3] == 0) continue;

        var tempName = child.name;
        var num = tempName.substring(0,1);
        var targetValue = numMap[num];
        if(targetValue == subCengName){

        }else{
           alert("错  ，目前是第"+subCengName+"阶段，出现了"+tempName);
           var rename = numMapRe[subCengName]+""+tempName;
           alert(tempName+"修改结果为："+rename);
           child.name = rename;
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
