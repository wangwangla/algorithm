package kw.io;

import java.io.*;

public class DemoData {
    public static void main(String[] args) {
        try {
            DataInput input = new DataInputStream(new FileInputStream(new File("1.txt")));
            System.out.println(input.readUTF());
//            input.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
