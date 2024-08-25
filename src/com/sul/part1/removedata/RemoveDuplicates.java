package com.sul.part1.removedata;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        nums[index++] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
