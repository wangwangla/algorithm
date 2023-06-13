package com.grindcode._4_bina;

public class _540_singleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
//  11 22 7
    public int singleNonDuplicate2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = (left + right) >> 1;  //2
            if (mid % 2 == 0){
                if (nums[mid] == nums[mid+1]){
                    left = mid + 1;
                }else {
                    right = mid;
                }
            }else {
                if (nums[mid] == nums[mid - 1]){
                    left = mid + 1;
                }else {
                    right = mid;
                }
            }
        }
        return right;
    }

}
