package com.zhuanti.dongtaiguihua;


/**
 *
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）
 * 使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 *
 * 示例 1:
 *
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 *
 * 示例 2:
 *
 * 输入: n = 13
 * 输出: 2
 * 解释: 13 = 4 + 9
 */
public class __2_WanquanPingFangShu {
    public void xx(int n){
        int dp[] = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = i;
            for (int i1 = 1; i1*i1 < i; i1++) {
//                if (dp[i]>dp[i-i1*i1]+1){
                    dp[i] = Math.min(dp[i],dp[i-i1*i1]+1);
//                }
            }
        }

        for (int i : dp) {
            System.out.println(i);
        }
    }

    /**
     * 给一个正整数，  最少可以将它分为几个完全平方数之和
     *
     * 输入n=13
     * 输出2（13 = 4 + 9）
     *
     * 分析：
     *  - j^2最后一个
     *  - 倒数第二个 n - j^2
     *
     *  转移方程
     *  f[i] = min{f[i-j^2]+1}
     *
     *  初始f[0] = 0;
     *
     *  1~n  i   n^3/2
     *
     *
     */
    public static int mathodOne(int n){
        int f[] = new int[n+1];
        f[0] = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("------------");
            f[i] = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i; j++) {
                if (f[i-j*j]+1<f[i]){
                    f[i] = f[i-j*j]+1;
                    System.out.println(f[i]+"--"+i);
                }
            }
        }
        return f[n];
    }


    public static void main(String[] args) {
        __2_WanquanPingFangShu shu = new __2_WanquanPingFangShu();
        shu.xx(12);
    }
}
