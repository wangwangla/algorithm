package com.learn.src.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSrc {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.remove(0);
        System.out.println(arrayList.toString());
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
