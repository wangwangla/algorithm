package com.zhuanti.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge {
    public void merge(int[] A, int m, int[] B, int n) {
        int xx = A.length - B.length;
        for (int i = 0; i < B.length; i++) {
            A[xx+i] = B[i];
        }
        Arrays.sort(A);
    }

    public static void main(String[] args) {

    }
}
