package com.zhuanti.array;

/*
27  RemoveElement
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)return 0;
        int saoIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[saoIndex++] = nums[i];
            }
        }
        return saoIndex;
    }
}
