package com.labuladong._2_chaptertwo;

public class _272_WanquanBeibao {
    public static void main(String[] args) {

    }


    int change1(int amount,int []coins){
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];
        for (int i = 1; i < n+1; i++) {
            for (int i1 = 1; i1 < amount+1; i1++) {
                if (i1-coins[i]<0){
                    dp[i][i1] = dp[i-1][i1];
                }else {
                    dp[i][i1] = dp[i-1][i1] + dp[i][i1-coins[i-1]];
                }
            }
        }
        return dp[n][amount];
    }

    int change(int amount,int []coins){
        int n = coins.length;
        int dp[] = new int[amount+1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int i1 = 1; i1 < amount+1; i1++) {
                if (i1-coins[i]>=0){
                    dp[i1] = dp[i1]+dp[i1-coins[i]];
                }
            }
        }
        return dp[amount];
    }
}
