package com.offer.rowoffer;

public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int sum[] = new int[nums.length+1];
        for (int i = 1; i <= nums.length; i++) {
            sum[i] = sum[i-1] + nums[i - 1];
        }


        int count = 0;
        for (int i = 0; i <= sum.length; i++) {
//            if (sum[i] == k) {
//                count++;
//            }
            for (int i1 = 1; i1 < i; i1++) {
                if (sum[i] - sum[i1] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySum subarraySum = new SubarraySum();
        int arr[] = {1,1,1};
        subarraySum.subarraySum(arr,2);
    }
}
