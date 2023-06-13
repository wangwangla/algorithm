package kw.io;

import com.beust.ah.A;

import java.io.IOException;
import java.util.ArrayList;

public class BitsApp {
    public static void main(String[] args) {
        //-128  127
        byte[] b = new byte[10];
        b[0] = 0;
        b[1] = 50;
        char aChar = getChar(b, 0);
        test();
        System.gc();
        System.out.println(aChar);
//        System.gc();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test(){
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(new BitsApp());
        }
    }

    static char getChar(byte[] b, int off) {
        return (char) ((b[off + 1] & 0xFF) +
                (b[off] << 8));
    }


}
