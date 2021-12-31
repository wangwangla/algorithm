package com.rowoffer;

/**
 * 最长公共子序列，但是不要求顺序相同
 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int dp[][] = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            char c = text1.charAt(i-1);
            for (int i1 = 1; i1 <= n; i1++) {
                char c1 = text2.charAt(i1-1);
                if (c == c1){
                    dp[i][i1] = dp[i-1][i1-1] + 1;
                }else {
                    dp[i][i1] = Math.max(dp[i-1][i1],dp[i][i1-1]);
                }
            }
        }
        return dp[m][n];
    }
}
