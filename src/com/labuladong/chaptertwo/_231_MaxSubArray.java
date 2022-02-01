package com.labuladong.chaptertwo;

/**
 * 最大子数组
 */
public class _231_MaxSubArray {
    int maxSubArray(int [] num){
        int dp[] = new int[num.length];
        dp[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            dp[i] = num[i];
            dp[i] = Math.max(dp[i],dp[i-1]+num[i]);
        }
        return 0;
    }

    int maxSubArray1(int [] num){
//        int dp[] = new int[num.length];
//        dp[0] = num[0];
//        for (int i = 1; i < num.length; i++) {
//            dp[i] = num[i];
//            dp[i] = Math.max(dp[i],dp[i-1]+num[i]);
//        }
        int sum[] = new int[num.length+1];
        for (int i = 0; i < num.length; i++) {
            sum[i+1] = sum[i]+num[i];
        }
        System.out.println("----------------");

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sum.length; i++) {
            for (int i1 = 0; i1 < i; i1++) {
                max = Math.max(sum[i]-sum[i1],max);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {-3,4,-1,2,-6,1,4};
        _231_MaxSubArray subArray = new _231_MaxSubArray();
        subArray.maxSubArray1(arr);
    }

}
