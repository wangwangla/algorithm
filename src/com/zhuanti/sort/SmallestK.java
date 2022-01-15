package com.zhuanti.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SmallestK {
    public int[] smallestK(int[] arr, int k) {
        Arrays.sort(arr);
        int aa [] = new int[k];
        for (int i = 0; i < k; i++) {
            aa[i] = arr[i];
        }
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < k; i++) {
//            arrayList.add(arr[i]);
//        }
////        for (int i = k; i < arr.length; i++) {
////            int i1 = arr[i];
//
////            arrayList.sort(new Comparator<Integer>() {
////                @Override
////                public int compare(Integer o1, Integer o2) {
////                    return o1.compareTo(o2);
////                }
////            });
////        }
//
        return null;
    }
}
