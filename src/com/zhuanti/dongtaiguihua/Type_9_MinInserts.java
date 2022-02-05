package com.zhuanti.dongtaiguihua;

public class Type_9_MinInserts {
    int minInserts(String s){
        int n = s.length();
//        操作次数，如果只有一个字符，那么结果就是0
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }
        for (int i = n-2; i > 0 ; i--) {
            for (int i1 = i+1; i1 < n; i1++) {
                if (s.charAt(i) == s.charAt(i1)){
                    dp[i][i1] = dp[i+1][i1-1];
                }else {
                    dp[i][i1] = Math.min(dp[i+1][i1],dp[i][i1-1])+1;
                }
            }
        }
        return 0;
    }
}
