package com.shuati.array;

import java.util.Arrays;

/**
 * @author:28188
 * @date: 2021/7/6
 * @time: 7:26
 *
 */
public class Question02 {
    public void nextPermutation(int[] nums) {
        // nums 123
        /**
         * 实现思路：从后向前遍历，找出一个非递增的，记录下来，然后再次循环 ，然后进行交换
         */
        int i = nums.length-2;
        while (i>=0&&nums[i]>=nums[i+1]){
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[i] > nums[j]) {
                j--;
            }
            if (i!=j)
            swap(nums, i, j);
            else
                Arrays.sort(nums);
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Question02 question02 = new Question02();
        int[] ints = {1, 3, 2};
        question02.nextPermutation(ints);
        System.out.println("============");
    }
}
