package com.zhuanti.array;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 * 注意：你不能在买入股票前卖出股票。
 *
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 *
 * 示例 2:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * 从一个数组中   找到最小值和最大值，  最小值在前，最大值在后
 */
public class _121_MaxProfit {
    public int maxProfit(int[] prices) {
        //最小值为第一个
        int min = prices[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            //第0个为0
            int value = prices[i] - min;
            //继续寻找最小的值
            if (prices[i]<min){
                min = prices[i];
            }
            //当前减去最小的最大值
            if (max<value){
                max = value;
            }
        }
        return max;
    }

//    下面的方法基本是上面方法转换过来的

    public int maxProfit1(int[] prices) {
        int len = prices.length;
        // 特殊判断
        if (len < 2) {
            return 0;
        }
        int[][] dp = new int[len][2];

        // dp[i][0] 下标为 i 这天结束的时候，不持股，手上拥有的现金数
        // dp[i][1] 下标为 i 这天结束的时候，持股，手上拥有的现金数

        // 初始化：不持股显然为 0，持股就需要减去第 1 天（下标为 0）的股价
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        // 从第 2 天开始遍历
        for (int i = 1; i < len; i++) {
            //今天不持股  ，  昨天不持股  如果昨天持股就卖掉
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            //昨天持股 和 今天持股   找出绝对值更小的  找最小值  更新最小值
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]); //执行一次
        }
        return dp[len - 1][0];
    }
}