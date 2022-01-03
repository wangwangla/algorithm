package com.zhuanti.array;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)return 0;
        int saoIndex = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]){
                nums[saoIndex++] = nums[i];
            }
        }
        nums[saoIndex++] = nums[nums.length - 1] ;
        return saoIndex;
    }

    public static void main(String[] args) {
        RemoveDuplicates duplicates = new RemoveDuplicates();
        int arr[] = {
               1,1,2
        };
        duplicates.removeDuplicates(arr);
    }
}
