package com.letcode;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.List;

public class _1380_LuckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int h = matrix.length;
        int w = matrix[0].length;
        int[] row = new int[h], col = new int[w];
        for (int i = 0; i < h; i++) {
            row[i] = Integer.MAX_VALUE;
            for (int i1 = 0; i1 < w; i1++) {
                row[i] = Math.min(row[i],matrix[i][i1]);
                col[i1] = Math.max(col[i1],matrix[i][i1]);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            for (int i1 = 0; i1 < w; i1++) {
                if (matrix[i][i1]==row[i]) {
                    if (row[i] == col[i1]) {
                        arrayList.add(row[i]);
                    }
                }
            }
        }
        return arrayList;
    }

    /*[[3,7,8],[9,11,13],[15,16,17]]*/
    public static void main(String[] args) {
        int arr[][] = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        _1380_LuckyNumbers numbers = new _1380_LuckyNumbers();
        numbers.luckyNumbers(arr);
    }
}
