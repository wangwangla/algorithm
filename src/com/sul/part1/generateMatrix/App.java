package com.sul.part1.generateMatrix;

/**
 * 螺旋数组
 */
public class App {
//    generateMatrix
    public int[][] generateMatrix(int n){
        int arr[][] = new int[n][n];
        int startX = 0;
        int startY = 0;
        int offset = 1;
        int count = 1;
        int loop = 1;
        int i,j;
        while (loop <= n/2){
            //左边 到 右边
            for (i = startY; i < n - offset; i++) {
                arr[startX][i] = count++;
            }
            //上到下
            for (int i1 = startX; i1 < n-offset; i1++) {
                arr[i1][i] = count;
            }
            for (i = n - offset; i > startY ; i--) {
//                arr[][]
            }

            }
        return null;
    }
}
