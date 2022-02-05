package com.algorithm.dongtaiguihua;

public class WanquanPingFangShu {
    public void xx(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int i1 = 1; i1*i1 < i; i1++) {
                if (dp[i]>dp[i-i1*i1]+1){
                    dp[i] = dp[i-i1*i1]+1;
                }
            }
        }
    }
}
