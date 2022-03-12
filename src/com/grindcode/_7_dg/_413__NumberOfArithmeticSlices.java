package com.grindcode._7_dg;

/**
 * 数组里面有多少个等差数列
 *
 *
 */
public class _413__NumberOfArithmeticSlices {
    public int numberOfArithmeticSlices(int arr[]){
        int length = arr.length;
        if (length < 3)return 0;
        int dp[] = new int[length];

        for (int i = 2; i < length; i++) {
            if (arr[i] - arr[i-1] == arr[i-1] - arr[i-2]){
                dp[i] = dp[i-1]+1;
            }
        }
        int ret = 0;
        for (int i = 0; i < dp.length; i++) {
            ret += dp[i];
        }
        return ret;
    }
}
