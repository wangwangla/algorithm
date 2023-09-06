package com.zhuanti.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算偏移
 */
public class _54_spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        //如果为null，或者没数据就返回
        if(matrix == null || matrix.length == 0)
            return list;
        //高
        int m = matrix.length;
        //宽
        int n = matrix[0].length;
        int i = 0;

        //统计矩阵从外向内的层数，如果矩阵非空，那么它的层数至少为1层
        int count = (Math.min(m, n)+1)/2;
        //从外部向内部遍历，逐层打印数据
        while(i < count) {
            /**
             * 层
             * 左到右
             */
            for (int j = i; j < n-i; j++) {
//                System.out.println(matrix[i][j]);
                list.add(matrix[i][j]);
            }
            for (int j = i+1; j < m-i; j++) {
                list.add(matrix[j][(n-1)-i]);
            }

            for (int j = (n-1)-(i+1); j >= i && (m-1-i != i); j--) {
                list.add(matrix[(m-1)-i][j]);
            }
            for (int j = (m-1)-(i+1); j >= i+1 && (n-1-i) != i; j--) {
                list.add(matrix[j][i]);
            }
            i++;
        }
        return list;
    }

//    1   2   3    4   5   6   7
//    21  22  23   24  25  26  8
//    20  33  34   35  36  27  9
//    19  32  31   30  29  28  10
//    18  16  15   14  13  12  11

    public void test(int matrix[][]){
        //如果为null，或者没数据就返回
        if(matrix == null || matrix.length == 0)
            return ;
        //高
        int m = matrix.length;
        //宽
        int n = matrix[0].length;
        int i = 0;

        //统计矩阵从外向内的层数，如果矩阵非空，那么它的层数至少为1层
        int count = (Math.min(m, n)+1)/2;
        //从外部向内部遍历，逐层打印数据
        while(i < count) {
            /**
             * 层
             * 左到右
              */
            for (int j = i; j < n-i; j++) {
                System.out.print(matrix[i][j]);
            }
            //上 -> 下
            for (int j = i+1; j < m-i; j++) {
                System.out.println(matrix[j][(n-1)-i]);
            }
            //回
            for (int j = (n-1)-(i+1); j >= i && (m-1-i != i); j--) {
                System.out.println(matrix[(m-1)-i][j]);
            }
            //下->上
            for (int j = (m-1)-(i+1); j >= i+1 && (n-1-i) != i; j--) {
                System.out.println(matrix[j][i]);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        _54_spiralOrder spiralOrder = new _54_spiralOrder();
        spiralOrder.test(arr);
    }

}
