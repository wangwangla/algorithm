package com.labuladong.chaptertwo;

/**
 * 最大子数组
 */
public class _231_MaxSubArray {
    int maxSubArray(int [] num){
        int dp[] = new int[num.length];
        dp[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            dp[i] = num[i];
            dp[i] = Math.max(dp[i],dp[i - 1]+num[i]);
        }
        return 0;
    }
}
