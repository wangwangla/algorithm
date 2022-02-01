package com.labuladong.chapterfour;

import java.util.List;

public class _481_PancakeSort {
    public List<Integer> pancakeSort(int[] cakes){
        for (int i = 1; i < cakes.length; i++) {
            for (int i1 = 0; i1 < cakes.length-i; i1++) {
                if (cakes[i1]>cakes[i1+1]){
                    int temp = cakes[i1];
                    cakes[i1] = cakes[i1+1];
                    cakes[i1+1] = temp;
                }
            }
        }
        System.out.println("-----------------");
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        _481_PancakeSort sort = new _481_PancakeSort();
        sort.pancakeSort(arr);

    }
}
