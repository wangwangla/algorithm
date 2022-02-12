package com.zhuanti.dongtaiguihua;

public class CoinChange {
    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        int []a= {/*1,2,5*/474,83,404,3};
//        [474,83,404,3]
//        264
        coinChange.coinChange(a,264);
    }

    public int coinChange1(int arr[],int amount){
        if (amount == 0)return 0;
        if (amount < 0)return Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
//        做选择
        for (int i = 0; i < arr.length; i++) {
            int i1 = coinChange(arr, amount - arr[i]);
            if (i1 != Integer.MAX_VALUE) {
                res = Math.min(res,1+i1);
            }
        }
        return res != Integer.MAX_VALUE ? res:Integer.MAX_VALUE;
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
