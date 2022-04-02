package com.doul;

public class _2_TriangularSum {
    static int res = 0;
    public static int triangularSum(int[] nums) {
        sum(nums);
        return 0;
    }

    private static void sum(int[] nums) {
        if (nums.length==1)
        {
            res  = nums[0];
            return ;
        }
        int num1[] = new int[nums.length-1];
        for (int i = 1; i < nums.length; i++) {
            num1[i-1] = (nums[i]+nums[i-1])%10;
        }
        sum(num1);
    }
}
