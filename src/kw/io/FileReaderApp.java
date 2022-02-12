package kw.io;

import java.io.*;

public class FileReaderApp {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        FileReader reader = new FileReader(file);
        char[] b = new char[1024];
        //只返回长度
//        int read = reader.read();
        int read1 = reader.read(b);
        System.out.println(new String(b,0,read1));


        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.println(bufferedReader.readLine());

    }
}
