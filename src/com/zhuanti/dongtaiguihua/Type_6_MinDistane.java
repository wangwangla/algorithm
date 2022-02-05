package com.zhuanti.dongtaiguihua;

public class Type_6_MinDistane {
    int minDistance(String s1,String s2){
        int s1Length = s1.length();
        int s2Length = s2.length();
        int dp[][] = new int[s1Length+1][s2Length+1];
        /**
         *  编辑的最小距离
         * 1.
         */
        for (int i = 0; i < s1Length; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < s2.length(); i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < s1Length+1; i++) {
            for (int i1 = 1; i1 < s2Length+1; i1++) {
                if (s1.charAt(i-1) == s2.charAt(i1-1)){
                    dp[i][i1] = dp[i-1][i1-1];
                }else {

                }
            }
        }
        return 0;
    }
}
