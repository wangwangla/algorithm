package com.zhuanti.array;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        //行列先设置
        int j = grid.length;
        int i = grid[0].length;
        int dp[][] = new int[j][i];
        int sum = 0;
        for (int i1 = 0; i1 < j; i1++) {
            sum += grid[i1][0];
            dp[i1][0] = sum;
        }
        sum = 0;
        for (int i1 = 0; i1 < i; i1++) {
            sum += grid[0][i1];
            dp[0][i1] = sum;
        }
        for (int i1 = 1; i1 < j; i1++) {
            for (int i2 = 1; i2 < i; i2++) {
                dp[i1][i2] = Math.min(dp[i1-1][i2],dp[i1][i2-1]) + grid[i1][i2];
            }
        }
        return dp[j-1][i-1];
    }
}
