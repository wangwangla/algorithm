package com.zhuanti.sort;

import java.util.Arrays;

/**
 * 给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。
 *
 * 如果数组元素个数小于 2，则返回 0。
 *
 * 示例 1:
 */
public class MaximumGap {
    public int maximumGap(int[] nums) {
        if (nums.length<2)return 0;
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max,nums[i] - nums[i-1]);
        }
        return max;
    }
}
