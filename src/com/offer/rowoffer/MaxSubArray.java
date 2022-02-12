package com.offer.rowoffer;

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

    public int maxSubArray2(int arr[]){
        int n = arr.length;
        if (n == 0) return 0;
        int dp[] = new int[n];
        dp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(arr[i],dp[i-1] + arr[i]);
        }
        return 0;
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
