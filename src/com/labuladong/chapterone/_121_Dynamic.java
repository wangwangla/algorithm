package com.labuladong.chapterone;

/**
 * 1.base
 * 2.state
 * 3.select
 * 4.define dp
 */
public class _121_Dynamic {
    int fib(int n){
        if (n == 0)return 0;
        if (n == 1 || n == 2)return 1;
        int dp[] = new int[n+1];
        dp[1] = dp[2] = 1; //base
        //state
        for (int i = 3; i <= n; i++) {
            //selet
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    int coinChange(int []coins,int amount){
        int dp[] = new int[amount+1];
        dp[0] = 0;//初始值
        for (int i = 1; i <= amount; i++) {
            //当前值
            dp[i] = Integer.MAX_VALUE;
            for (int i1 = 0; i1 < coins.length; i1++) {
                if (dp[i - coins[i1]] == Integer.MAX_VALUE){
                    continue;
                }
                if (i - coins[i1] <0)continue;
                dp[i] = Math.min(dp[i - coins[i1]]+1,dp[i]);
            }
        }
        return dp[amount];
    }
}
