package com.zhuanti.erfenchazhao;

public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int i1 = 0; i1 < i; i1++) {
                if (nums[i]>nums[i1]){
                    dp[i] = Math.max(dp[i1]+1,dp[i]);
                }
            }
        }
        return dp[nums.length - 1];
    }
}