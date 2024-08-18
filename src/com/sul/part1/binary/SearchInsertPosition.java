package com.sul.part1.binary;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int tarhget = 2;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.soulation(arr, tarhget));
    }

    public int soulation(int arr[],int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = (int) (left + (right - left) / 2.0f);
            if (arr[mid]>target){
                right = mid - 1;
            }else if (arr[mid]<target){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return left;
    }
}
