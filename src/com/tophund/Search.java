package com.tophund;

public class Search {
    public int search(int[] nums, int target) {
        if (nums[0] == target) {
            return 0;
        }
        if (nums[0]<target){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
                if (nums[i]>target){
                    return -1;
                }
            }
        }else {
            for (int i = nums.length-1; i > 0; i--) {
                if (nums[i] == target) {
                    return i;
                }
                if (nums[i]<target){
                    return -1;
                }
            }
        }
        return -1;
    }
}
