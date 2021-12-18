package com.zhuanti.array;

/**
 * 0 1
 * 0 0
 */

/**
 * 这个需要加一个
 *
 * 如果在第一层或者是第一列出现，那么这一行或者这一列都需要为0
 */
public class JIqiRen {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int i1 = 0; i1 < obstacleGrid[0].length; i1++) {
                if (obstacleGrid[i][i1] == 1){
                    dp[i][i1] = 0;
                }else if (i ==0||i1 ==0){
                    dp[i][i1] = 1;
                }else {
                    dp[i][i1] = dp[i-1][i1]+dp[i][i1-1];
                }
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
