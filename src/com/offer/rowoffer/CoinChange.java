package com.offer.rowoffer;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int dp [] = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int i1 = 0; i1 < coins.length; i1++) {
                if (i>=coins[i1]){
                    if (dp[i - coins[i1]]!=Integer.MAX_VALUE)
                        dp[i] = Math.min(dp[i],1+dp[i-coins[i1]]);
                }
            }
            }
            return dp[amount] == Integer.MAX_VALUE ? -1:dp[amount];
    }
}