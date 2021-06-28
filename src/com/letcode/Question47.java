package com.letcode;

/**
 * @author:28188
 * @date: 2021/5/20
 * @time: 7:39
 *
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question47 {
    public static void main(String[] args) {
        int aa[][] = {{1,2,3},{4,5,6}};
        minPathSum(aa);
    }

    /**
     *    public int minPathSum(int[][] grid) {
     *         if (grid == null || grid.length == 0 || grid[0].length == 0) {
     *             return 0;
     *         }
     *         int rows = grid.length, columns = grid[0].length;
     *         int[][] dp = new int[rows][columns];
     *         dp[0][0] = grid[0][0];
     *         for (int i = 1; i < rows; i++) {
     *             dp[i][0] = dp[i - 1][0] + grid[i][0];
     *         }
     *         for (int j = 1; j < columns; j++) {
     *             dp[0][j] = dp[0][j - 1] + grid[0][j];
     *         }
     *         for (int i = 1; i < rows; i++) {
     *             for (int j = 1; j < columns; j++) {
     *                 dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
     *             }
     *         }
     *         return dp[rows - 1][columns - 1];
     *     }
     * }
     *
     * 作者：LeetCode-Solution
     * 链接：https://leetcode-cn.com/problems/minimum-path-sum/solution/zui-xiao-lu-jing-he-by-leetcode-solution/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param grid
     * @return
     */
    public static int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int hight = grid.length;
        int width = grid[0].length;
        int arr[][] = new int[width][hight];
        arr[0][0] = grid[0][0];
        //因为方向 是向下或者是向右
        for (int i = 1; i < hight; i++) {
            arr[i][0] = grid[i][0] + arr[i-1][0];
        }
        for (int i = 1; i < width; i++) {
            arr[0][i] = grid[0][i]+arr[0][i-1];
        }

        for (int i = 1; i < hight; i++) {
            for (int i1 = 1; i1 < width; i1++) {
                arr[i][i1] = grid[i][i1] + Math.min(arr[i-1][i1],arr[i][i1-1]);
            }
        }
        return arr[hight-1][width-1];
    }
}
