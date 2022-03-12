//package com.grindcode._7_dg;
//
///**
// * 距离0最近的距离
// */
//public class _542_Matrix {
//    public int[][] updateMatrix(int arr[][]){
//        int h = arr.length;
//        int w = arr[0].length;
//        int dp[][] = new int[h+1][w+1];
//        for (int i = 0; i < h; i++) {
//            for (int i1 = 0; i1 < w; i1++) {
//                dp[i][i1] = Integer.MAX_VALUE;
//                if (arr[i][i1]==0){
//                    dp[i][i1] = 0;
//                }else {
//                    dp[i][i1] = Math.min(dp[i][i1],dp[i][i1]);
//                }
//            }
//        }
//    }
//}
