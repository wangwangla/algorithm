package com.zhuanti.array;

/**
 * 62
 *
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 *
 * 问总共有多少条不同的路径？
 *
 * 当前位置由上和左边决定的。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _62_UniquePaths {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                if (i==0||i1==0){
                    dp[i][i1] = 1;
                }else {
                    dp[i][i1] = dp[i-1][i1] + dp[i][i1-1];
                }
            }
        }
        return dp[m][n];
    }
}
