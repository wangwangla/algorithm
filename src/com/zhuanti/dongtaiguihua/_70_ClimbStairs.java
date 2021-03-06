package com.zhuanti.dongtaiguihua;

public class _70_ClimbStairs {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1; //0级就不需要走
        dp[1] = 1; //1级走一步
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
