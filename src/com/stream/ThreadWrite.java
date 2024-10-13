package com.stream;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ThreadWrite extends Thread{
    private ArrayList<byte[]> aa;
    private FileDownloadRandomAccessFile file;
    private File tempFile;
    public ThreadWrite(ArrayList<byte[]> aa, FileDownloadRandomAccessFile file, File file1){
        this.aa = aa;
        this.file = file;
        this.tempFile = file1;
    }

    @Override
    public void run() {
        super.run();
        for (byte[] bytes : aa) {
            try {
                System.out.println("thread name "+ Thread.currentThread().getName());
                file.write(bytes,0,bytes.length);
                file.flushAndSync();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(tempFile.delete());
    }
}
