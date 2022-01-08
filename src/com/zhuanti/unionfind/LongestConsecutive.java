package com.zhuanti.unionfind;

import java.util.Arrays;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        int count = 1;
        int max = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) {
                count ++;
            }else {
                max = Math.max(max,count);
                count = 1;
            }
        }
        max = Math.max(max,count);
        return max;
    }
    public int longestConsecutive1(int[] nums) {
        int count = 1;
        int max = 0;

        max = Math.max(max,count);
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        longestConsecutive.longestConsecutive(nums);
    }
}
