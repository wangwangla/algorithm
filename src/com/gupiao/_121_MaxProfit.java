package com.gupiao;

public class _121_MaxProfit {
    public int maxProfit(int []prices){
        int len = prices.length;
        //只有一天  没法玩
        if (len < 2){
            return 0;
        }

        //没有交易为0
        int res = 0;
        for (int i = 0; i < len-1; i++) {
            for (int i1 = i+1; i1 < len; i1++) {
                res = Math.max(res,prices[i1] - prices[i]);
            }
        }
        return res;
    }

    public int maxProfit1(int[] prices) {
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

    public int maxProfit2(int[] prices) {
        int dp = 0;
        int min = prices[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            dp = prices[i] - min;
            min = Math.min(prices[i],min);
            max = Math.max(max,dp);
        }
        return max;
    }
}
