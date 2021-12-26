package kw.other.arraylist;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println("-0------");


        int i = 1000000;
        MyArrayList myArrayList = new MyArrayList(i);
        for (int i1 = 0; i1 < i; i1++) {
            myArrayList.setNum(i1);
        }
        long startTime = System.currentTimeMillis();

        for (int i1 = 0; i1 < i; i1++) {
            myArrayList.getNum(i1);
        }
        long l = System.currentTimeMillis() - startTime;
        System.out.println("---"+l);
    }
}
