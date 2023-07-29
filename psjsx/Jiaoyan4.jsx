 var ttt = {};
var originalDoc;
try {
    originalDoc = app.activeDocument;
} catch (ignored) {
}
run();
function run() {
    activeDocument.duplicate();
    try {
        executeAction(stringIDToTypeID("rasterizeAll"), undefined, DialogModes.NO);
    } catch (ignored) {
    }
    var group = [];
    collectGroup(activeDocument);
    for (var i = 0, n = group.length; i < n; i++) {
        collectLayers(group[i])
    }
}
function collectGroup(layer) {
    for (var i = 0, n = layer.layers.length; i < n; i++) {
        var child = layer.layers[i];
        if (!child.visible)
            continue;
        if (child.bounds[2] == 0 && child.bounds[3] == 0) continue;

        if (child.layers && child.layers.length > 0){
            collectGroup(child)
        }else if (child.kind == LayerKind.NORMAL) {
            var nnn = child.name;
            var len = nnn.length;
            var result = nnn.substring(1,len);
            if(ttt[result]){
                alert("重复  "+nnn);
            }
            ttt[result] = true;
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
