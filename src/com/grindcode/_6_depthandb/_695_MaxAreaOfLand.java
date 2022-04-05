package com.grindcode._6_depthandb;

public class _695_MaxAreaOfLand {
    /**
     * 岛屿的个数
     *
     * @param grid
     * @return
     */
    int mrealandNum(int [][]grid){
        int count = 0;
        int row = grid.length;
        int line = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int i1 = 0; i1 < line; i1++) {

                if (grid[i][i1] == 1) {
                    count ++;
                    find(grid,i,i1);
                }
            }
        }
        return count;
    }


    int area = 0;
    int maxArealandNum(int [][]grid){
        int count = 0;
        int row = grid.length;
        int line = grid[0].length;
        int maxArea = 0;
        for (int i = 0; i < row; i++) {
            for (int i1 = 0; i1 < line; i1++) {
                if (grid[i][i1] == 1) {
                    area=0;
                    find1(grid,i,i1);
                    System.out.println(area);
                    maxArea = Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        _695_MaxAreaOfLand land = new _695_MaxAreaOfLand();
        int grid[][] = {{1,0,1,1,0,1,0,1},{1,0,1,1,0,1,1,1},{0,0,0,0,0,0,0,1}};
        System.out.println(land.maxArealandNum(grid));
    }

    public void find(int arr[][],int i,int i1){
        if (arr[i][i1] == 1){
            arr[i][i1] = 0;
        }
        if (i-1>=0&&arr[i-1][i1] == 1){
            arr[i-1][i1] = 0;
            find(arr,i-1,i1);
        }
        if (i1-1>=0&&arr[i][i1-1] == 1){
            arr[i-1][i1] = 0;
            find(arr,i,i1-1);
        }
        if (i+1<arr.length&&arr[i+1][i1] == 1){
            arr[i+1][i1] = 0;
            find(arr,i+1,i1);
        }
        if (i1+1<arr[0].length&&arr[i][i1+1] == 1){
            arr[i][i1+1] = 0;
            find(arr,i,i1+1);
        }
    }

    public void find1(int arr[][],int i,int i1){
        if (arr[i][i1] == 1){
            area++;
            arr[i][i1] = 0;
        }
        if (i-1>=0&&arr[i-1][i1] == 1){
            arr[i-1][i1] = 0;
            area++;
            find1(arr,i-1,i1);
        }
        if (i1-1>=0&&arr[i][i1-1] == 1){
            area++;
            arr[i-1][i1] = 0;
            find1(arr,i,i1-1);
        }
        if (i+1<arr.length&&arr[i+1][i1] == 1){
            area++;
            arr[i+1][i1] = 0;
            find1(arr,i+1,i1);
        }
        if (i1+1<arr[0].length&&arr[i][i1+1] == 1){
            area++;
            arr[i][i1+1] = 0;
            find1(arr,i,i1+1);
        }
    }
}
