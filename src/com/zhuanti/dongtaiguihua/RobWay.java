package com.zhuanti.dongtaiguihua;

/**
 * 解法存在问题
 */
public class RobWay {
    public void robWay(int arr[][]){
        //这个不需要创建多余的空间
        int dp[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                //有障碍   障碍的时候，后面都不可以走， 解法存在问题
                if(arr[i][j] == 1){
                    dp[i][j] = 0;
                    continue;
                }
                if (i==0||j==0){
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        System.out.println(dp[arr.length-1][arr[0].length-1]);
    }
}
