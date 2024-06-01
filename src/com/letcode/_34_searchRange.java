package com.letcode;

/**
 * 给一个排序数组，找出一个数字的开始位置和结束位置
 */
public class _34_searchRange {
    public void searchRange(int[]arr ,int target){

    }

    public int left_bound(int nums[],int target){
        int left = 0;
        int right = nums.length - 1;
        while (left<=right){
            int mid = left + (right - left) / 2;
            if (nums[mid]>target){
                right = mid - 1;
            }else if (nums[mid]<target){
                left = mid + 1;
            }else if (nums[mid] == target){ //等于接着超左边找
                right = mid - 1;
            }
        }
        if (left >= nums.length || nums[left] != target){
            return -1;
        }
        return left;
    }

    public void right_bound(int arr[],int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = left + (left + right) / 2;
            if (arr[mid] > target){
                right = mid - 1;
            }else if (arr[mid] < target){
                left = mid + 1;
            }else if (arr[mid] == target){ //接着朝右边找
                left = left + 1;
            }
        }
    }
}
