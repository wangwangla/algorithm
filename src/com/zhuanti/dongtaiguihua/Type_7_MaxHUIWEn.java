package com.zhuanti.dongtaiguihua;

public class Type_7_MaxHUIWEn {
    public void lengthHuiwen(String s){
        int n = s.length();
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int i = n-2; i > 0 ; i--) {
            for (int i1 = i+1; i1 < n; i1++) {
                if (s.charAt(i) == s.charAt(i1)){
                    dp[i][i1] = dp[i+1][i1-1]+2;
                }else {
                    dp[i][i1] = Math.max(dp[i+1][i1],dp[i][i1-1]);
                }
            }
        }
    }
}
