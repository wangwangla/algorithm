package com.zhuanti.array;

/**
 * 53
 */
public class MaxSubArray {
    /**
     * 超时了
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int max = 0;
        int sum [] = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = nums[i] + sum[i-1];
        }


        max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max,sum[i]);
            for (int i1 = 0; i1 < i; i1++) {
                max = Math.max(max,sum[i]-sum[i1]);
            }
        }
        return max;
    }

    public int maxSubArray2(int []nums){
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(dp[i],max);
        }
        return max;
    }

    public int maxSubArray1(int[] nums) {
        int max = 0;
        int sum [] = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = nums[i] + sum[i-1];
        }


        max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max,sum[i]);
            for (int i1 = 0; i1 < i; i1++) {
                max = Math.max(max,sum[i]-sum[i1]);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int arr[] = {5,4,-1,7,8};
        MaxSubArray maxSubArray = new MaxSubArray();
        maxSubArray.maxSubArray(arr);
    }
}
