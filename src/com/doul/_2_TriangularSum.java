package com.doul;

/**
 * 三角形
 * 1 2 3 4 5
 * 3 5 7 9
 * 8 2 6
 * 0 8
 *
 * 只要各位不要十位
 */
public class _2_TriangularSum {
    static int res = 0;
    public int triangularSum(int[] nums) {
        sum(nums);
        return 0;
    }

    public static void main(String[] args) {
        _2_TriangularSum sum = new _2_TriangularSum();
        sum.triangularSum(new int[]{1,2,3,4,5});
    }

    private void sum(int[] nums) {
        if (nums.length==1)
        {
            res  = nums[0];
            return ;
        }

        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println();
        int num1[] = new int[nums.length-1];
        for (int i = 1; i < nums.length; i++) {
            num1[i-1] = (nums[i]+nums[i-1])%10;
        }
        sum(num1);
    }
}
