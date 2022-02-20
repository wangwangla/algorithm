package com.offer.rowoffer;

import com.labuladong._2_chaptertwo._221_CompletePack;

/**
 * 硬币 求出得到目标钱树
 */
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

    public static void main(String[] args) {
        int arr[] = new int[]{2,3,5};
        CoinChange completePack = new CoinChange();
//        completePack.completePack1(arr,5);
        completePack.coinChange(arr,21);
    }
}