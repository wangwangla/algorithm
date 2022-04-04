package com.grindcode._3_doublepoint;

public class _1_TwoNum {
    public int[] twoNum(int arr[],int target){
        int left = 0;
        int right = arr.length - 1;
        while (left<right){
            int sum = arr[left] + arr[right];
            if (sum > target) {
                right --;
            }else if (sum < target){
                left ++;
            }else {
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{-1,-1};
    }
}
