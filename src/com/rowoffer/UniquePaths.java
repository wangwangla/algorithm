package com.rowoffer;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int dp [][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                if (i==0||i1==0){
                    dp[i][i1] = 1;
                }else {
                    dp[i][i1] = dp[i-1][i1] + dp[i][i1-1];
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePaths();
        System.out.println(uniquePaths.uniquePaths(7, 3));
    }
}
