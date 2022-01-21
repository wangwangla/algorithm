package com.test.io;

import java.io.File;

public class FileApp {
    public static void main(String[] args) {
        File file = new File("/");
        list(file);
    }

    public static void list(File file){
        if (file==null)return;
        if (file.listFiles()==null)return;
        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory()){
                list(listFile);
            }else if (listFile.isFile()){
                System.out.println(listFile);
            }
        }
    }
}
