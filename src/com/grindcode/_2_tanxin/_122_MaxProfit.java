package com.grindcode._2_tanxin;

/**
 * 给定一个数组 prices ，其中 prices[i] 表示股票第 i 天的价格。
 *
 * 在每一天，你可能会决定购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。
 * 你也可以购买它，然后在 同一天 出售。
 * 返回 你能获得的 最大 利润 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _122_MaxProfit {
    /**
     * 彩票存在买与不买两种情况
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][2];
        dp[0][0] = 0; //没买
        dp[0][1] = - prices[0]; //买了
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[prices.length-1][0];
    }

    public int maxCaip(int prices[]){
        //两种状态  买与不买
        int dp[][] = new int[prices.length][2];
        dp[0][0] = 0; //不买不花钱
        dp[0][1] = -prices[0]; // 买了花钱了
        for (int i = 1; i < prices.length; i++) {
            //今天不买  前一天不买  前一天买了，买了可以有多少钱
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]); //
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] - prices[i]);  // 买与不买应该是不合适，应该改为受否拥有
        }
        return dp[prices.length-1][0];
    }
}
