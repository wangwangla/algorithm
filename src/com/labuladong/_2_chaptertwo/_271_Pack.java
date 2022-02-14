package com.labuladong._2_chaptertwo;

public class _271_Pack {
    //n个物体   w总重量   wei是重量数组   v价值数组
    public int knpack(int w,int n,int wei[],int v[]){
        int dp[][] = new int[n+1][w+1];
        // 物体
        for (int i = 1; i < n + 1; i++) {
            //当前物体可以得到的最大重量
            for (int i1 = 1; i1 < w+1; i1++) {
                if (i1 - wei[i-1] < 0){
                    dp[i][i1] = dp[i-1][i1];
                }else {
                    dp[i][i1] = Math.max(
// 不 取
                            dp[i-1][i1],
// 取
                            dp[i-1][i1 - wei[i-1]]+v[i-1]);
                }
            }
        }
        return dp[n][w];
    }

}
