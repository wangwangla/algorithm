package com.sul.part1.removedata;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 */
public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement element =  new RemoveElement();
        int arr[] = {
                1,2,3,4,5,6,7,8,9,0
        };
        int target = 9;
        System.out.println(element.removeElement(arr, target));
    }
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
