package kw;

import java.io.*;

public class App {
    public static void main(String[] args) {
        try( FileInputStream inputStream = new FileInputStream(new File("1.dat"));
             FileOutputStream stream = new FileOutputStream(new File("1.png"))) {
            int c = -1;
            while ((c = inputStream.read())!=-1){
                stream.write(c^5);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}