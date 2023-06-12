var imagesDir = "./images/";
var projectDir = "./images/";
var table = {};
var originalDoc;
try {
    originalDoc = app.activeDocument;
} catch (ignored) {
}
table["一"] = true;
table["二"] = true;
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
            }else{

            }

//             collect.push(child)
//             alert("加入数据");
        }
    }
}


function collectLayers(layer) {
    var cengName = layer.name;
    var subCengName = cengName.substring(1,2);

    for (var i = 0, n = layer.layers.length; i < n; i++) {
        var child = layer.layers[i];
        if (!child.visible)
            continue;
        if (child.bounds[2] == 0 && child.bounds[3] == 0) continue;

           var tempName = child.name;
           var num = tempName.substring(0,1);
           if(subCengName == "一"){
                if(num ==1){
//                     alert("对")
                }else{
                    alert("错  ，目前是第"+subCengName+"阶段，出现了"+tempName);
                    child.name = 1+""+tempName.substring(1,tempName.length);
                }
           }else if(subCengName == "二"){
                 if(num ==2){
//                      alert("对")
                 }else{
                     alert("错  ，目前是第"+subCengName+"阶段，出现了"+tempName);
                    child.name = 2+""+tempName.substring(1,tempName.length);

                 }
            }else if(subCengName == "三"){
              if(num ==3){
//                   alert("对")
              }else{
                  alert("错  ，目前是第"+subCengName+"阶段，出现了"+tempName);
                  child.name = 3+""+tempName.substring(1,tempName.length);

              }
         }else if(subCengName == "四"){
               if(num ==4){
//                    alert("对")
               }else{
                   alert("错  ，目前是第"+num+"阶段，出现了"+tempName);
                   child.name = 4+""+tempName.substring(1,tempName.length);

               }
          }else if(subCengName == "五"){
                            if(num ==5){
//                                 alert("对")
                            }else{
                                alert("错  ，目前是第"+subCengName+"阶段，出现了"+tempName);

                             child.name = 5+""+tempName.substring(1,tempName.length);
                             }
                       }else if(subCengName == "六"){
                         if(num ==6){
//                              alert("对")
                         }else{
                             alert("错  ，目前是第"+subCengName+"阶段，出现了"+tempName);
                          child.name = 6+""+tempName.substring(1,tempName.length);
                         }
                    }else if(subCengName == "七"){
                          if(num ==7){
//                               alert("对")
                          }else{
                              alert("错  ，目前是第"+num+"阶段，出现了"+tempName);
                               child.name = 7+""+tempName.substring(1,tempName.length);
                          }
                     }
         else if(subCengName == "八"){
                          if(num ==8){
//                               alert("对")
                          }else{
                              alert("错  ，目前是第"+subCengName+"阶段，出现了"+tempName);
                          child.name = 8+""+tempName.substring(1,tempName.length);
                          }
                     }else if(subCengName == "九"){
                       if(num ==9){
//                            alert("对")
                       }else{
                           alert("错  ，目前是第"+subCengName+"阶段，出现了"+tempName);
                       child.name = 9+""+tempName.substring(1,tempName.length);
                       }
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
