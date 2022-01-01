package kw.other.list.hashMap;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("1",1);


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
