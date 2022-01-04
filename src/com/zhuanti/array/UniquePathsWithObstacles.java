package com.zhuanti.array;

public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int j = obstacleGrid.length;
        int i = obstacleGrid[0].length;
        int dp[][] = new int[j][i];
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
        UniquePathsWithObstacles uniquePathsWithObstacles = new UniquePathsWithObstacles();
        uniquePathsWithObstacles.uniquePathsWithObstacles(arr);
    }
}
