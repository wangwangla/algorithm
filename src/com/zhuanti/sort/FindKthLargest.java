package com.zhuanti.sort;

import java.util.Arrays;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int index = 1;
        if (k>=nums.length){
            return nums[nums.length-k];
        }
        return 0;
    }


    public int findKthLargest1(int[] nums, int k) {
        int length = nums.length;
        int max = Integer.MAX_VALUE;
        if (length/2 < k){
            for (int i = 0; i < k; i++) {
                max = nums[i];
                for (int i1 = i; i1 < length; i1++) {
                    if (max<nums[i1]){
                        int te = max;
                        max = nums[i1];
                        nums[i1] = te;
                    }
                }
            }
        }else {
            max = Integer.MIN_VALUE;
            for (int i = 0; i <nums.length -  k + 1; i++) {
                max = nums[i];
                for (int i1 = i; i1 < length; i1++) {
                    if (max>nums[i1]){
                        int te = max;
                        max = nums[i1];
                        nums[i1] = te;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr [] = {3,2,3,1,2,4,5,5,6};
        FindKthLargest largest = new FindKthLargest();
        System.out.println(largest.findKthLargest1(arr, 4));
    }

}
