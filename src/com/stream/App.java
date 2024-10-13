package com.stream;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<ArrayList<byte[]>> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
             ArrayList<byte[]> bytes = new ArrayList<>();
            for (int i1 = 0; i1 < 100; i1++) {
                byte [] bb = new byte[1000];
                for (int i2 = 0; i2 < 1000; i2++) {
                    bb[i2] = (byte) i;
                }
                bytes.add(bb);
            }
            arrayList.add(bytes);
        }
        File file = new File("xxx");
        FileDownloadRandomAccessFile f = new FileDownloadRandomAccessFile(file);
        for (ArrayList<byte[]> bytes : arrayList) {
            ThreadWrite threadWrite = new ThreadWrite(bytes,f,file);
            threadWrite.start();
        }
    }
}
