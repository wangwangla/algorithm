package kw.string;

import java.io.*;

public class StringStuDemo {
    public static void main(String[] args) throws IOException {
        String str = "kw.test.demo.App";
        int index = str.lastIndexOf(".");
        System.out.println(str.substring(index + 1));
        System.out.println(str.substring(0,index));
    }
}
