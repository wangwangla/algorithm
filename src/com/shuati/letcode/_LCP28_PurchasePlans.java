package com.shuati.letcode;

import java.util.Arrays;

public class _LCP28_PurchasePlans {
    public static void main(String[] args) {
        _LCP28_PurchasePlans purchasePlans = new _LCP28_PurchasePlans();
        purchasePlans.purchasePlans(new int[]{2,3,5,5},6);
    }
    public int purchasePlans(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int count = 0;
        while (left<right){
            if (nums[left]+nums[right]>target){
                right--;
            }else {
                count+=right - left;
                left++;
            }
            count %= 1000000007;
        }
        return count % 1000000007;
    }
}
