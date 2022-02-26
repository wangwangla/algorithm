package com.zhuanti.array;

public class _122_MaxProfit {
    public int maxProfit(int[] prices) {
        int dp[] = new int[prices.length];
        dp[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i],prices[i]-prices[j]);
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
        return 0;
    }

    public int maxProfit1(int[] prices) {
        int dp[][] = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[prices.length][0];
    }



    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        _122_MaxProfit profit = new _122_MaxProfit();
        profit.maxProfit1(prices);
    }
}
