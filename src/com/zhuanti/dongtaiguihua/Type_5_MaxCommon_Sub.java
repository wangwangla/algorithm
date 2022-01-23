package com.zhuanti.dongtaiguihua;

public class Type_5_MaxCommon_Sub {
    public int longestCommonSequence(String str1,String str2){
        int m = str1.length();
        int n = str2.length();
        int dp[][] = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int i1 = 1; i1 <= n; i1++) {
                if (str1.charAt(i-1) == str2.charAt(i1-1)){
                    dp[i][i1] = dp[i-1][i1-1] + 1;
                }else {
                    dp[i][i1] = Math.max(dp[i][i1-1],dp[i-1][i1]);
                }
            }
        }
        return dp[m][n];
    }
}
