package com.grindcode._2_tanxin;

import java.util.ArrayList;

/**
 * 一群孩子站一排   每个孩子有自己的评分
 * 身高高的必须有更多的糖果
 *
 * [1,0,2]
 * 5
 */
public class _135_Candy {
    public static int candy(int []arr){
        int length = arr.length;
        int dp[] = new int[length];
        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[i-1]){
                dp[i] = dp[i-1]+1;
            }else {
                dp[i] = dp[i-1];
            }
        }

        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i]<arr[i-1]){
                dp[i-1] = Math.max(dp[i]+1,dp[i-1]);
            }
        }
        int c = 0;
        for (int i = 0; i < dp.length; i++) {
            c += dp[i];
        }
        return c;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2};
        _135_Candy candy = new _135_Candy();
        System.out.println(candy.candy(arr));
    }
}
