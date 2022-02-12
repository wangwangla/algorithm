package com.offer.rowoffer;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum - nums[0] == 0){
            return 0;
        }
        if (sum - nums[nums.length - 1] == 0){
            return nums.length - 1;
        }

        int leftCount = nums[0];
        int rightCount = nums[nums.length-1];
        int start = 0;
        int end = nums.length - 1;

        for (int i = 1; i < nums.length-1; i++) {
//            leftCount += nums[start];
//            rightCount += nums[end];

            if (leftCount - rightCount>0){
                end --;
                rightCount+=nums[end];
            }else if (leftCount - rightCount<0){
                start ++;
                leftCount += nums[start];
            }else {
                return start+1;
            }
            if (start>=end){
                break;
            }
        }
        return -1;
    }

    public int pivotIndex1(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int tal = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 *  tal + nums[i] == sum){
                return i;
            }
            tal += nums[i];
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {-1,-1,-1,-1,-1,-1};
        PivotIndex pivotIndex = new PivotIndex();
        pivotIndex.pivotIndex(arr);
    }
}
