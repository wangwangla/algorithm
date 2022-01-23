package com.zhuanti.dongtaiguihua;

public class Type_1_LIS {
    //最长递增子序列

    /**
     * 最长递增子序列
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums){
        int dp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int i1 = 0; i1 < i; i1++) {
                if (dp[i]>dp[i1]){
                    dp[i] = Math.max(dp[i],dp[i1] + 1);
                }
            }
        }
        return dp[nums.length - 1];
    }
}
