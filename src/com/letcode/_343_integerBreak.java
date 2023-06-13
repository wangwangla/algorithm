package com.letcode;

public class _343_integerBreak {
    public int integerBreak(int n) {
        int dp[] = new int[n+1];
        for (int i = 2; i < n; i++) {
            int curMax = 0;
            for (int i1 = 1; i1 < i; i1++) {
                curMax = Math.max(curMax,Math.max(i1*(i-i1),i1*dp[i-i1]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}
