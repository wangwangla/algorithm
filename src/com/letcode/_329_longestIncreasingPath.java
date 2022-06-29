package com.letcode;

import com.doul._1_minBitFlips;

public class _329_longestIncreasingPath {
    private int [][] matrix,memo;
    private int m,n;
    public int longestIncreasingPath(int[][] _matrix) {
        matrix = _matrix;
        m = matrix.length;
        n = matrix[0].length;
        int res = 1;
        memo = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                if (memo[i][i1] == 0){
                    res = Math.max(res,dfs(i,i1));
                }
            }
        }
        return res;
    }

    public int dfs(int i,int j){
        if (memo[i][j] != 0){
            return memo[i][j];
        }

        int [][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        int maxLength = 1;
        for (int []dir : dirs){
            int nextI = i + dir[0];
            int nextJ = j + dir[1];
            if (nextI >= 0 && nextI < m && nextJ >= 0 && nextJ <n &&matrix[nextI][nextJ]>matrix[i][j]){
                maxLength = Math.max(maxLength,dfs(nextI,nextJ)+1);
            }
        }
        memo[i][j] = maxLength;
        return maxLength;
    }
}
