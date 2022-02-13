package com.labuladong._2_chaptertwo;

public class _211_LengthLIS {
     int lengthOfLIS(int[] nums){
         int dp[] = new int[nums.length];
         dp[0] = 1;
         int max = 1;
         int length = nums.length;
         for (int i = 0; i < length; i++) {
             dp[i] = 1;
             for (int j = 0; j < i; j++) {
                 if (nums[i] > nums[j]) {
                     dp[i] = Math.max(dp[i], dp[j] + 1);
                     max = Math.max(dp[i],max);
                 }
             }
         }
         System.out.println("---------------");
         return max;
     }

    public static void main(String[] args) {
         _211_LengthLIS a211LengthLIS = new _211_LengthLIS();
         a211LengthLIS.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});

    }
}
