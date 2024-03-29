package com.zhuanti.array;

/**
 * 中间有不可以通过的点
 */
public class _63_UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int j = obstacleGrid.length;
        int i = obstacleGrid[0].length;
        int dp[][] = new int[j][i];
        //第一行  第一列为1，但是如果存在障碍，后面的就停止
        for (int i1 = 0; i1 < j; i1++) {
            if (obstacleGrid[i1][0] == 0) {
                dp[i1][0] = 1;
            }else {
                break;
            }
        }
        for (int i1 = 0; i1 < i; i1++) {
            if (obstacleGrid[0][i1] == 0) {
                dp[0][i1] = 1;
            }else {
                break;
            }
        }
        for (int i1 = 1; i1 < j; i1++) {
            for (int i2 = 1; i2 < i; i2++) {
                if (obstacleGrid[i1][i2] != 1) {
                    dp[i1][i2] = dp[i1 - 1][i2] + dp[i1][i2 - 1];
                }else {
                    dp[i1][i2] = 0;
                }
            }
        }
        return dp[j-1][i-1];
    }

    public static void main(String[] args) {
        int arr[][] = {{0,0,0},{0,1,0},{0,0,0}};
        _63_UniquePathsWithObstacles uniquePathsWithObstacles = new _63_UniquePathsWithObstacles();
        System.out.println(uniquePathsWithObstacles.uniquePathsWithObstacles(arr));
    }
}
