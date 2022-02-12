package com.offer.rowoffer;

import java.util.Arrays;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int cur = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1])continue;
            if (nums[i-1]+1 == nums[i]){
                cur ++;
            }else {
                max = Math.max(max,cur);
                cur = 1;
            }
        }
        max = Math.max(max,cur);
        return max;
    }

    public static void main(String[] args) {
        int arr [] = {0,3,7,2,5,8,4,6,0,1};
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        System.out.println(longestConsecutive.longestConsecutive(arr));
    }
}

