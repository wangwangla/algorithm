package com.zhuanti.dongtaiguihua;

public class CoinChange {
    public static void main(String[] args) {
        com.zhuanti.CoinChange coinChange = new com.zhuanti.CoinChange();
        int []a= {/*1,2,5*/474,83,404,3};
//        [474,83,404,3]
//        264
        coinChange.coinChange(a,264);
    }
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int i1 = 0; i1 < coins.length; i1++) {
                if(i<coins[i1]){
                    // dp[i] = dp[i-1];
                    continue;
                }
                if(dp[i - coins[i1]]!=Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i],dp[i - coins[i1]]+1);

                }
            }
        }

        if (dp[amount] == Integer.MAX_VALUE){
            return -1;
        }
        return dp[amount];
    }
}
