package com.grindcode.tanxin;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class _435_EraseOverlapIntervals {
    public static int eraseOverlapIntervals(int [][] arr){
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]- o2[1];
            }
        });

        int start = arr[0][1];
        int total = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] < start) {
                ++ total;
            }else {
                start = arr[i][1];
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(eraseOverlapIntervals(new int[][]{{1, 2}, {2, 4}, {1, 3}}));
    }
}
