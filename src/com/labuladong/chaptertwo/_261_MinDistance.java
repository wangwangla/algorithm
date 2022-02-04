package com.labuladong.chaptertwo;

public class _261_MinDistance {
    /**
     * 将s1变为s2
     *
     */
    public int minDistance(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= m; i++) {
            for (int i1 = 1; i1 <= n; i1++) {
                if (s1.charAt(i-1) == s2.charAt(i1-1)) {
                    dp[i][i1] = dp[i-1][i1-1];
                }else {
//                    max(dp[i-1][i1]);

//                    dp[i-1][i1];
//                    dp[i][i1+1];
//                    dp[i-1][i1-1];
                }
            }
        }
        return 0;
    }
}
