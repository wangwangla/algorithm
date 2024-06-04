package com.letcode;

/**
 * 插入正确的位置
 */
public class _35_SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        while (right >= left){
            int mid = left + (right - left) / 2;
            if (nums[mid] > target){
                right = mid - 1;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int searchInsert2(int[] nums,int target){
        int left = 0;
        int right = nums.length;
        while (left<right){
            int mid = left + (right - left) / 2;
            if (target>nums[left]){
                left = mid + 1;
            }else if (target < nums[right]){
                right = mid;
            }else {
                right = mid;
            }
        }
        return left;
    }
}
