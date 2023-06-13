package com.zhuanti.sort;

import java.util.Arrays;

public class SmallestDifference {
    public int smallestDifference(int[] a, int[] b) {
        long min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < b.length; i1++) {
                min = Math.min(min,Math.abs((long) a[i] - (long) b[i1]));
            }
        }
        return (int) min;
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        return 0;
    }

    public void xx(){

    }

    public static void main(String[] args) {
        int a[] = {-2147483648,1};
        int arr[] = {2147483647,0};
        SmallestDifference difference = new SmallestDifference();
        System.out.println(difference.smallestDifference(a, arr));
    }
}
