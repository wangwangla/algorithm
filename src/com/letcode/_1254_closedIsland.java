package com.letcode;

/**
 * 多看
 */
public class _1254_closedIsland {
    public int closedIsland(int[][] grid) {
        int count = 0;
        if (grid.length==1||grid[0].length==1){
            return count;
        }
        for (int i = 1; i < grid.length-1; i++) {
            for (int i1 = 1; i1 < grid[0].length-1; i1++) {
                if (grid[i][i1] == 0){
                    if(dfs(grid,i,i1)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public boolean dfs(int[][] grid, int x, int y){
        if(x < 0 || x == grid.length || y < 0 || y == grid[0].length){
            return false;
        }
        if(grid[x][y] != 0) {
            return true;
        }
        grid[x][y] = 1;
        boolean up = dfs(grid, x - 1, y);
        boolean right = dfs(grid, x, y + 1);
        boolean down = dfs(grid, x + 1, y);
        boolean left = dfs(grid, x, y - 1);
        return up && right && down && left;
    }

    public static void main(String[] args) {
        int arr[][] =
               {{1,1,1,1,1,1,1,0},
                {1,0,0,0,0,1,1,0} ,
                {1,0,1,0,1,1,1,0},
                {1,0,0,0,0,1,0,1},
                {1,1,1,1,1,1,1,0}};
        _1254_closedIsland closedIsland = new _1254_closedIsland();
        System.out.println(closedIsland.closedIsland(arr));
        System.out.println("---------------------");

    }
}
