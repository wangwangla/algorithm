package com.labuladong.chapterone;

public class _152_LRPoint {

    int binarySearch(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        //为什么写等于   因为查找范围一个闭区间
        while (left<=right){
            int mid = (right + left) >> 1;
            if (target>nums[mid]){
                left = mid + 1;
            }else if (target<nums[mid]){
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    int[] twoSum(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int sum = nums[left] + nums[right];
            if (sum == target){
                return new int[]{left,right};
            }else if (sum > target){
                right --;
            }else {
                left ++;
            }
        }
        return new int[]{-1,-1};
    }

    void revese(int [] num){
        int left = 0;
        int rigth = num.length - 1;
        while (left < rigth){
            int temp  = num[left];
            num[left] = num[rigth];
            num[rigth] = temp;
            left++;
            rigth--;
        }
    }

    /**
     * 补充
     */
}
