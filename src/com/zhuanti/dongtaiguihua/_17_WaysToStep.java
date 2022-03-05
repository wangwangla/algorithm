package com.zhuanti.dongtaiguihua;

/**
 * 题目：
 *  三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，
 *  你需要对结果模1000000007。
 *
 *  示例1:
 *   输入：n = 3
 *   输出：4
 *   说明: 有四种走法
 *
 *  示例2:
 *   输入：n = 5
 *   输出：13
 *  提示:
 *
 *  n范围在[1, 1000000]之间
 *
 * 思路：
 * 动态规划：n 阶可以往前退一步，可以时n-1阶所有情况之和+可以时n-2阶所有情况之和+可以时n-3阶所有情况之和
 *
 */
public class _17_WaysToStep {
    /**
     * 爬楼梯有多少种走法
     * @param n
     * @return
     */
    public int waysToStep1(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        int arr[] ={1,2,3};
        for (int i = 1; i < n; i++) {
            for (int i1 : arr) {
                if (i>=i1){
                    dp[i] += dp[i-i1] %1000000007;
                }
            }
        }
        return dp[n];
    }
}
