package com.letcode;

public class _1251_oddCells {

    public int oddCells(int m, int n, int[][] indices) {
        int arr[][] = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int x = indices[i][0];
            int y = indices[i][1];
            for (int i1 = 0; i1 < arr[0].length; i1++) {
                arr[x][i1] +=1;
            }
            for (int i1 = 0; i1 < arr.length; i1++) {
                arr[i1][y] += 1;
            }
        }

        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[0].length; i1++) {
                if (arr[i][i1] % 2==1) {
                  c++;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int m = 2, n = 3;
        int indices[][] = {{0,1},{1,1}};
        _1251_oddCells cells = new _1251_oddCells();
        cells.oddCells(m,n,indices);
    }
}
