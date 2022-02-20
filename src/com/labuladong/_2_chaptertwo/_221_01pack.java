package com.labuladong._2_chaptertwo;

public class _221_01pack {
    /**
     *
     * @param w 重量
     * @param n n个
     * @param wei 质量数组
     * @param val 价值
     * @return
     */
    public int knpack(int w,int n,int wei[],int val[]){
        int dp[][] = new int[n+1][w+1];
        for (int i = 1; i <= n; i++) {
            for (int i1 = 1; i1 <= w; i1++) {
                if (i1-wei[i]>=0){
                    dp[i][i1] =
                            Math.max(
                              dp[i-1][i1],//不要
                              dp[i-1][i-wei[i-1]] + val[i-1] //要
                            );
                }else {
                    dp[i][i1] = dp[i-1][i1];
                }
            }
        }
        return dp[n][w];
    }
}
