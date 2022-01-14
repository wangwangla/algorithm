package com.zhuanti.sort;

import java.util.Arrays;
import java.util.Comparator;

public class DoWork {
    public void doMaxWork(int arr[][]){
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int end_x = arr[0][1];
        int xxx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] >= end_x) {
                xxx ++;
            }
        }

    }


    public void doMaxWork1(int arr[][]){
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int end_x = arr[0][1];
        int xxx = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] >= end_x) {
                xxx++;
                end_x = arr[i][0];
            }
        }
    }

    /**
     * 动规
     * @param arr
     */
    public void doMaxWork2(int arr[][]) {
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1] - o2[1];
                }
            });
            int dp[] = new int[arr.length];
            dp[0] = 1;
            int max = 1;
            for (int i = 0; i < arr.length; i++) {
                for (int i1 = 0; i1 < i; i1++) {
                    if (arr[i][0] >= arr[i1][1]) {
                        dp[i] = Math.max(dp[i], dp[i1] + 1);
                        max = Math.max(max, dp[i]);
                    }
                }
            }
        System.out.println();
//            return arr.length - max;
    }

    public static void main(String[] args) {
        int arr  [][] = {{1,2},{1,2},{1,2}};
        DoWork work = new DoWork();
        work.doMaxWork2(arr);
    }

}
