package com.letcode;

public class _1719_missingTwo {
    public static void main(String[] args) {
        missingTwo(new int[]{1});
    }
    public static int[] missingTwo(int[] nums) {
        int ans [] = new int[2];
        int []arr = new int[nums.length+3];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = 1;
        }
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                ans[index++] = i;
            }
        }
        return ans;
    }
}
