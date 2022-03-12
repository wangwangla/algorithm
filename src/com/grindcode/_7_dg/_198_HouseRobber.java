package com.grindcode._7_dg;

public class _198_HouseRobber {
    int rob(int arr[]){
        int length = arr.length;
        int dp[] = new int[length+1];
        dp[0] = 0;
        dp[1] = arr[0];
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+arr[i-1]);
        }
        return dp[length-1];
    }
}
