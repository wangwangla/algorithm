package com.zhuanti.dongtaiguihua;

/**
 * 最大子数组
 *
 * 转移方程 ，要不使用之前的，要不重开一只
 */
public class Type_3_MAX_SUB_ARRAY {
    public int maxSubArray(int[] nums){
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //转移方程，就是是不是要将前面的都不要了
            dp[i] = Math.max(nums[i],nums[i]+dp[i-1]);
        }
        return 0;
    }
}
