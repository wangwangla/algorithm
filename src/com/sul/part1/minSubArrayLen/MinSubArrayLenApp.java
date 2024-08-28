package com.sul.part1.minSubArrayLen;

import java.util.Map;

public class MinSubArrayLenApp {
    public int minSubArrayLen(int s, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s){
                result = Math.min(result,i-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
//        ：s = 7, nums = [2,3,1,2,4,3]
        int target = 7;
        int arr[] = {
                2,3,1,2,4,3
        };
        MinSubArrayLenApp app = new MinSubArrayLenApp();
        System.out.println(app.minSubArrayLen(target, arr));
    }
}
