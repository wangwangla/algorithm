package com.zhuanti.bitmanipulation;

import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }


    public int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {

            }
        }
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }


}
