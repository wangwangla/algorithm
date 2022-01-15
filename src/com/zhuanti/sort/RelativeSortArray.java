package com.zhuanti.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int length = arr1.length;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            hashMap.put(arr1[i],hashMap.getOrDefault(arr1[i],0)+1);
        }
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            Integer integer = hashMap.remove(arr2[i]);
            for (Integer i1 = 0; i1 < integer; i1++) {
                length --;
                arr1[index++] = arr2[i];
            }
        }

        int size = length;
        int aa[] = new int[size];
        int xx = 0;
        for (Integer integer : hashMap.keySet()) {
            Integer integer1 = hashMap.get(integer);
            for (Integer i = 0; i < integer1; i++) {
                aa[xx++] = integer;
            }
        }
        Arrays.sort(aa);
        for (int i : aa) {
            arr1[index++] = i;
        }
        return arr1;
    }

    public static void main(String[] args) {
        int arr1[] = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int arr2[] = {2,42,38,0,43,21};
        RelativeSortArray array = new RelativeSortArray();
        array.relativeSortArray(arr1,arr2);
    }
}
