package com.labuladong._2_chaptertwo;

/**
 * 股票1 :
 * 一个数组，  买卖一次
 */
public class _281_GP1 {
    public int gp(int arr[]){
        int n = arr.length;
        int [][] dp = new int[n][2];
        dp[0][0] = 0;//不买
        dp[0][1] = -arr[0];//买入
        for (int i = 1; i < n; i++) {
            //前一天没买如       如果买入的收益
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+arr[i]);
            dp[i][1] = Math.max(dp[i-1][0],-arr[i]);
        }
        System.out.println(dp[n - 1][0]);
        return dp[n-1][0];
    }
}
