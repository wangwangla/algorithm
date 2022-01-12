package com.zhuanti.sort;

import java.util.Arrays;

public class WiggleSort {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int arr1[] = new int[nums.length/2];
        int arr2[] = new int[nums.length - nums.length/2];
        for (int i = 0; i < nums.length / 2; i++) {
            arr1[i] = nums[i];
        }
        for (int i = nums.length/2; i < nums.length; i++) {
            arr2[i-nums.length/2] = nums[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            nums[2*i] = arr1[i];
            nums[2*i+1] = arr2[i];
        }
    }

    public static void main(String[] args) {
        WiggleSort sort = new WiggleSort();
        sort.wiggleSort(new int[]{1,1,2,1,2,2,1});
    }
}
