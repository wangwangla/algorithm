package com.labuladong.chapterfour;

public class _491_SubArraySum {
    public int subrraysum(int []nums,int k){
        int n = nums.length;
        int sum[] = new int[n+1];
        sum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
        }
        return 0;
    }
}
