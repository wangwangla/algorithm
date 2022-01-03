package com.zhuanti.dongtaiguihua;

public class WaysToStep {
    public int waysToStep(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        int arr[] ={1,2,3};
        for (int i = 1; i < n; i++) {
            for (int i1 : arr) {
                if (i>=i1){
                    dp[i] = Math.min(dp[i],dp[i-i1]+1);
                }
            }
        }
        return dp[n];
    }


    public int waysToStep1(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        int arr[] ={1,2,3};
        for (int i = 1; i < n; i++) {
            for (int i1 : arr) {
                if (i>=i1){
                    dp[i] += dp[i-i1];
                }
            }
        }
        return dp[n];
    }
}
