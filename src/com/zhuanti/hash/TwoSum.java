package com.zhuanti.hash;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length;
        while (start<end){
            int mid = (start + end)/2;
            if (nums[mid] + nums[mid+1] == target){

            }else if (nums[mid] + nums[mid + 1]<target){

            }
        }
        return null;
    }
}
