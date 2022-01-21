package com.test.file;

import java.io.*;

/**
 * 复习一下文件 读写
 */
public class Dmeo {

    public void read3(){
        try {
            BufferedInputStream reader = new BufferedInputStream(new FileInputStream(new File("README.md")));
            byte[] b = new byte[1024];
            while ((reader.read(b)) != -1) {
                System.out.println(new String(b));
            }
        } catch (Exception e) {

        }
    }


    //读取磁盘
    public void read() throws Exception {
        FileInputStream inputStream = new FileInputStream(new File("README.md"));
        byte[] b = new byte[1024];
        StringBuilder builder = new StringBuilder();
        while (inputStream.read(b) != -1) {
            System.out.println(new String(b));
        }
    }

    public void read2(){
        try {
            FileReader reader = new FileReader(new File("README.md"));
            char[] b = new char[1024];
            while (reader.read(b) != -1) {
                System.out.println(new String(b));
            }
        } catch (Exception e) {

        }
    }

    public void read4(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("README.md")));
            String str = "";
            while ((str = reader.readLine())!=null) {
                System.out.println(str);
            }
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) throws Exception {
        Dmeo dmeo = new Dmeo();
        dmeo.save4();
    }

    //写入磁盘
    public void save() throws Exception {
        FileOutputStream stream = new FileOutputStream(new File("demo.txt"));
        byte b[] = new byte[10];
        b[0] = 1;
        b[1] = 2;
        //这种并不适合我们输入
        stream.write(b);
        stream.flush();
    }

    public void save1() throws Exception {
        BufferedOutputStream stream = new BufferedOutputStream(
                new FileOutputStream(new File("demo.txt")));
        byte[] b= new byte[10];
        stream.write(b);
        stream.flush();
    }

    public void save2() throws Exception {
        FileWriter stream = new FileWriter(new File("demo.txt"));
        stream.write("sssss");
        stream.flush();
    }

    public void save4() throws Exception {
        BufferedWriter stream =
                new BufferedWriter(
                        new FileWriter(
                                new File("demo.txt")));
        stream.write("sjd");
        stream.flush();
    }


}
