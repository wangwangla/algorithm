package com.letcode;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _704_Search {
    public int search(int[] nums, int target) {
        int result = -1;
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = left + ((right - left) / 2);
            if (nums[mid]>target){
                right = mid-1;
            }else if (nums[mid]<target){
                left = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public int search1(int arr[],int target){
        int left = 0;
        int right = arr.length - 1;
        //为什么要等于  加入只有一个元素怎么搞
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (arr[mid]>target){
                right = mid - 1;
            }else if (arr[mid]<target){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {-1,0,3,5,9,12};
        _704_Search search = new _704_Search();
        System.out.println(search.search(arr, 2));

    }
}
