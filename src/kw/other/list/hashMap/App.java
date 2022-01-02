package kw.other.list.hashMap;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 15; i++) {
            hashMap.put(i,1);
        }
        System.out.println("---------------------------------");
        for (int i = 16; i < 132; i++) {
            hashMap.put(i,1);
        }




//        App app = new App();
//        app.ee(10);
    }

    public void ee(int cap){
        int n = cap - 1;
//        n |= n >>> 1;
//        n |= n >>> 2;
//        n |= n >>> 4;
//        n |= n >>> 8;
//        n |= n >>> 16;
        System.out.println(n>>>1);
        System.out.println(n>>>2);
        System.out.println(n>>>3);
        System.out.println(n>>>4);


    }
}
