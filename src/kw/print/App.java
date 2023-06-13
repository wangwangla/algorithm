package kw.print;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
//        File file = new File("testmkdirs/test.txt");
//        File tempParent = new File(file.getParent());
//        if (!tempParent.exists()) {
//            tempParent.mkdirs();
//        }
//
////        System.out.println(file.getName());
////        System.out.println(file.getParent());
////        file.mkdirs();
//        try (PrintWriter writer = new PrintWriter(file)){
//            writer.write("122xxxxx");
//            writer.println("123");
//        }

        String str = "kw.test.demo.App";
        int index = str.lastIndexOf(".");
        System.out.println(str.substring(index + 1));
    }
}
