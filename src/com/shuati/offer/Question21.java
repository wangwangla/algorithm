package com.shuati.offer;

/**
 * @author:28188
 * @date: 2021/4/20
 * @time: 8:12
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 *
 * 问总共有多少条不同的路径？
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：m = 3, n = 7
 * 输出：28
 * 示例 2：
 *
 * 输入：m = 3, n = 2
 * 输出：3
 * 解释：
 * 从左上角开始，总共有 3 条路径可以到达右下角。
 * 1. 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右
 * 3. 向下 -> 向右 -> 向下
 * 示例 3：
 *
 * 输入：m = 7, n = 3
 * 输出：28
 * 示例 4：
 *
 * 输入：m = 3, n = 3
 * 输出：6
 *
 */
public class Question21 {
    public int uniquePaths(int m, int n) {
        int dp [][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int y = 0; y < n; y++) {
                if (i == 0||y == 0){
                    dp[i][y] = 1;
                }else {
                    dp[i][y] = dp[i-1][y] + dp[i][y-1];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                System.out.println(dp[i][i1]);
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        Question21 question21 = new Question21();
        question21.uniquePaths(7,3);
    }
}
