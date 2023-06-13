package com.lcs;

/**
 * 简单点：
 * 求出数组中不和路相邻的个数   数字相同为一个空间
 *
 */
public class _LCS03_largestArea {
    public int largestArea(String[] grid) {
        int length = grid.length;
        int res = 0;
        for (int i = 0; i < length; i++) {
            for (int i1 = 0; i1 < grid[i].length(); i1++) {
                boolean flag = true;
                int count = 0;
                if (grid[i].charAt(i1)>='1' && grid[i].charAt(i1)<='5'){
                    helper(grid,i,i1,flag,grid[i].charAt(i1),count);
                    if (flag)res = Math.max(count,res);
                }
            }
        }
        return res;
    }

    private boolean helper(String[] grid, int i, int i1, boolean flag, char charAt, int count) {
        if (i<0 || i >= grid.length || i1 < 0 ||i1 >= grid[i].length() || grid[i].charAt(i1) == '0'){
            return false;
        }

        if (grid[i].charAt(i1) != charAt)return true;
//        grid[i][i1] = '6';
        count ++;
        helper(grid,i+1,i1,flag,charAt,count);
        helper(grid,i-1,i1,flag,charAt,count);
        helper(grid,i,i1+1,flag,charAt,count);
        helper(grid,i,i1-1,flag,charAt,count);
        return true;
    }
}
