package kw.io;

import java.io.*;

public class InputStreamApp {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        FileInputStream inputStream = new FileInputStream(file);
        byte[] b = new byte[1024];
        int read = inputStream.read(b);
        System.out.println(new String(b,0,read));

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        byte[] bytes = new byte[1024];
        bufferedInputStream.read(bytes);
        System.out.println(new String(bytes));

    }
}
