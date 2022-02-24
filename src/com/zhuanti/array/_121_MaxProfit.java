package com.zhuanti.array;

public class _121_MaxProfit {
    public int maxProfit(int[] prices) {
        int dp[] = new int[prices.length];
        int min = prices[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            dp[i] = prices[i] - min;
            if (prices[i]<min){
                min = prices[i];
            }
            if (max<dp[i]){
                max = dp[i];
            }
        }
        return max;
    }
}
