package com.zhuanti.array;

/**
 * 多笔交易
 */
public class _122_MaxProfit {
//    public int maxProfit(int[] prices) {
//        int dp[] = new int[prices.length];
//        dp[0] = 0;
//        for (int i = 1; i < prices.length; i++) {
//            for (int j = 0; j < i; j++) {
//                dp[i] = Math.max(dp[i],prices[i]-prices[j]);
//            }
//        }
//        int max = 0;
//        for (int i = 0; i < dp.length; i++) {
//            max += dp[i];
//        }
//        return max;
//    }

    public int maxProfit1(int[] prices) {
        int dp[][] = new int[prices.length][2];
        //不买为0
        dp[0][0] = 0;
        //买了为负数
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            //前一天没买  和   前一天买了  前一天买了  今天买不了了
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[prices.length-1][0];
    }



    public static void main(String[] args) {
//        int prices[] = {7,1,5,3,6,4};
        int prices[] = {1,2,3,4,5};
        _122_MaxProfit profit = new _122_MaxProfit();
        System.out.println(profit.maxProfit1(prices));
//        System.out.println(profit.maxProfit(prices));
    }
}
