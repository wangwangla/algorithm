package com.letcode;

/**
 * @author:28188
 * @date: 2021/5/17
 * @time: 7:53
 */
public class Question42 {

        public void setZeroes(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 0) {
                        for (int k = 0; k < matrix[i].length; k++) {
                            if (matrix[i][k] != 0) {
                                matrix[i][k] = 100;
                            }
                        }
                        for (int x = 0; x < matrix.length; x++) {
                            if (matrix[x][j] != 0)
                                matrix[x][j] = 500;
                        }
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 500) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }


}
