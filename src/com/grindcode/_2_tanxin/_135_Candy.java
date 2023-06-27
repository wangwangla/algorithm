package com.grindcode._2_tanxin;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 一群孩子站一排   每个孩子有自己的评分
 * 身高高的必须有更多的糖果 每一个必须有，并且高的会拥有的多
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

    public static int candy2(int []arr){
        int length = arr.length;
        int dp[] = new int[length];
        dp[0] = 1;
        int needNum = 1;
        int temp = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[i-1]){
                temp ++;
            }
            needNum += temp;
        }
        return needNum;
    }
//    1 2 2 2 2
//    1 2 2 2 2

//    1 2 3 2 2
//    1 2 2 2 2
//    1 2 3 3 3
//    1 2 4 3 3   修正

    public static void main(String[] args) {
        int arr[] = {1,0,2};
        _135_Candy candy = new _135_Candy();
        System.out.println(candy.candy(arr));
    }

    public int candy1(int []arr){
        int [] dp = new int[arr.length];
        dp[0]  = 1;
        for (int i = 1; i < arr.length; i++) {
            if (dp[i] > dp[i-1]){
                dp[i] = dp[i-1] + 1;
            }else {
                dp[i] = dp[i-1];
            }
        }
        for (int i = arr.length; i > 0; i--) {
            if (dp[i-1] > dp[i]){
                dp[i] = Math.max(dp[i]+1,dp[i-1]);
            }
        }
        int res = 0 ;
        for (int i = 0; i < dp.length; i++) {
            res += dp[i];
        }
        return res;
    }
}
