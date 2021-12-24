package com.zhuanti.dongtaiguihua;

public class DGMoban {
    // 0 1 背包
    public void maxValue(int w[],int v[],int target){
        int length = w.length;
        int dp[][] = new int[length+1][target+1];
        for (int i = 0; i < length; i++) {
            for (int i1 = 0; i1 < target; i1++) {
                if (i == 0 || i1 == 0){
                    dp[i][i1] = 0;
                }else {
                    if (w[i]>i1){
                        dp[i][i1] = dp[i-1][i1];
                    }else {
                        dp[i][i1] = Math.max(dp[i-1][i1],dp[i-1][i1-w[i]]+v[i]);
                    }
                }
            }
        }
    }


    // 完全   背包   完全背包，可以从自己的上一层进行
    public void maxValue3(int w[],int v[],int target){
        int length = w.length;
        int dp[][] = new int[length+1][target+1];
        for (int i = 0; i < length; i++) {
            for (int i1 = 0; i1 < target; i1++) {
                if (i == 0 || i1 == 0){
                    dp[i][i1] = 0;
                }else {
                    if (w[i]>i1){
                        dp[i][i1] = dp[i][i1];
                    }else {
                        dp[i][i1] = Math.max(dp[i][i1],dp[i][i1-w[i]]+v[i]);
                    }
                }
            }
        }
    }



    public void maxValue1(int w[],int v[],int target){
        int length = w.length;
        int dp[] = new int[target+1];
        for (int i = 0; i < length; i++) {
            for (int i1 = target; i1 > 0; i1--) {
//                if (w[i]>i1){
//                    dp[i][i1] = dp[i-1][i1];
//                }else {
//                    dp[i][i1] = Math.max(dp[i-1][i1],dp[i-1][i1-w[i]]+v[i]);
//                }
                if (w[i]>i1){
                    dp[i1] = 0;
                }else {
                    dp[i1] = Math.max(dp[i1],dp[i1 - w[i]]+v[i]);
                }
            }
        }
    }


    public void maxValue2(int w[],int v[],int target){
        int length = w.length;
        int dp[] = new int[target+1];
        for (int i = 0; i < length; i++) {
            for (int i1 = 0; i1<target; i1++) {
                if (w[i]>i1){
                    dp[i1] = 0;
                }else {
                    dp[i1] = Math.max(dp[i1],dp[i1 - w[i]]+v[i]);
                }
            }
        }
    }

}
