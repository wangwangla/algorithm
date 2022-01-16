package com.zhuanti.sort;

import java.util.Arrays;

public class _00_ArrayShuffle {
        public void shuffle(int[] arr){
            Arrays.sort(arr);
            int l = 0;
            int r = arr.length - 1;
            int aa[] = new int[arr.length];
            int index = 0;
            while (l<r){
                aa[index++] = arr[l++];
                if (l<r){
                    aa[index++] = arr[r--];
                }
            }
            for (int i : aa) {
                System.out.println(i);
            }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,12,345,33};
        _00_ArrayShuffle arrayShuffle = new _00_ArrayShuffle();
        arrayShuffle.shuffle(arr);
    }
}
