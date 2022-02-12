package com.offer.rowoffer;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int r = grid.length;
        int l = grid[0].length;
        int dp[][] = new int[r][l];

        for (int i = 0; i < l; i++) {
            if (i == 0){
                dp[0][0] = grid[0][0];
            }else {
                dp[0][i] = dp[0][i-1] + grid[0][i];
            }
        }

        for (int i = 0; i < r; i++) {
            if (i == 0){
                dp[0][0] = grid[0][0];
            }else {
                dp[i][0] = dp[i - 1][0] + grid[i][0];
            }
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < l; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[r-1][l-1];
    }

//    public int minPathSum(int[][] grid) {
//        int r = grid.length;
//        int l = grid[0].length;
//        int dp[][] = new int[r][l];
//
//        for (int i = 1; i < r; i++) {
//            for (int j = 1; j < l; j++) {
//                if (i==0 || j == 0){
//                    dp[i][j] = grid[i][j];
//                }else {
//                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
//                }
//            }
//        }
//        return dp[r-1][l-1];
//    }


    public static void main(String[] args) {
        int arr[][] = {
                {1,3,1},
                {1,5,1},
                {4,2,1}};
        MinPathSum sum = new MinPathSum();
        sum.minPathSum(arr);
    }
}
