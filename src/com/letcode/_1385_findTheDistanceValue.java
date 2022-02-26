package com.letcode;

public class _1385_findTheDistanceValue {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        boolean flag = false;
        for (int i = 0; i < arr1.length; i++) {
            flag = false;
            for (int i1 = 0; i1 < arr2.length; i1++) {
                if (Math.abs(arr1[i] - arr2[i1]) <= d) {
                    flag = true;
                    break;
                }
            }
            if (!flag){
                count++;
            }
        }
        return count;
    }
}
