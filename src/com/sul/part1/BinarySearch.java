package com.sul.part1;

public class BinarySearch {
    //给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
    // 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
//    输入: nums = [-1,0,3,5,9,12], target = 9
//    输出: 4
//    解释: 9 出现在 nums 中并且下标为 4

    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        int target = 9;
        BinarySearch search = new BinarySearch();
        System.out.println(search.search2(arr, target));
    }

    public int search2(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        while (left<right-1){
            int mid = (int) (left + (right - left)/2.0);
            if (arr[mid]>target){
                right = mid-1;
            }else if (arr[mid]<target){
                left = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public int search(int arr[],int target){
        int left = 0;
        int right = arr.length;
        while (left<right){
            int mid = (int) (left + (right - left)/2.0);
            if (arr[mid]>target){
                right = mid;
            }else if (arr[mid]<target){
                left = mid+1;
            }else {
               return mid;
            }
        }
        return -1;
    }


}
