package com.rowoffer;

public class MaxSubArray {
    public int maxSubArray(int arr[]) {
        int sum = arr[0], maxVal = Integer.MIN_VALUE;
        int i = 0;
        for (i = 1; i < arr.length; i++) {
             if (sum < 0)
                 sum = arr[i];
             else sum += arr[i];
            maxVal = Math.max(sum, maxVal);
        }
        return maxVal;
    }

    public int maxSubArray1(int arr[]){
        int sum = 0;
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (sum<=0){
                sum = arr[i];
            }else {
                sum += arr[i];
            }
            maxVal = Math.max(sum,maxVal);
        }
        return maxVal;
    }

    public static void main(String[] args) {
        MaxSubArray sum = new MaxSubArray();
        int arr[] = {
                1,3,-1,-1
        };
        System.out.println(sum.maxSubArray1(arr));
    }
}
