package com.sul.part1.binary;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 示例 1：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 */
public class FindStartEndPosition {
    public static void main(String[] args) {
        FindStartEndPosition findStartEndPosition = new FindStartEndPosition();
        findStartEndPosition.solution();
    }
    public void solution(){
        int arr[] = {1,2,2,3,4,5};
        System.out.println(findLeft(arr, 2));
        System.out.println(findRight(arr,2));
    }

    public int findLeft(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
        int leftboard = 0;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > target){
                end = mid - 1;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else {
                leftboard = mid;
                end = mid - 1;
            }
        }
        return leftboard;
    }


    public int findRight(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
        int rightboard = 0;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > target){
                end = mid - 1;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else {
                rightboard = mid;
                start = mid + 1;
            }
        }
        return rightboard;
    }
}
