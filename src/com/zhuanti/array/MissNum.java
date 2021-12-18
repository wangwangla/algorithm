package com.zhuanti.array;

public class MissNum {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int length = nums.length;
        int count = length*(length-1)/2;
        for (int num : nums) {
            count -= num;
        }
        return count;
    }
}
