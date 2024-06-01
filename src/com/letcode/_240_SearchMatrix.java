package com.letcode;

/**
 * 一个矩阵
 *
 * 从左到右是递增的
 * 从上到下是递增的
 *
 *
 * 搜索一个目标值
 *
 * 思路：
 *
 * 如果从左上角开始，向右边，向下都是递增的，但是如果从右上角开始，向下递增，向左边递减
 *
 */
public class _240_SearchMatrix {
    /**
     * 这个写法太绝对了， 会漏掉一些数据
     * @param arr
     * @param target
     * @return
     */
    public boolean searchMatrix(int arr[][],int target){
        int length = arr[0].length;
        int length1 = arr.length;
        int xx = length - 1;
        for (int i1 = length - 1; i1 >= 0; i1--) {
            if (arr[0][i1] < target) {
                xx = i1;
                break;
            }else if (arr[0][i1] == target){
                return true;
            }
        }
        for (int i = 0; i < length1; i++) {
            if (arr[i][xx] == target) {
                return true;
            }
        }
        return false;
    }

    public boolean searchMatrix1(int arr[][],int target){
        int length = arr[0].length;
        int length1 = arr.length;
        int x = length - 1;
        int y = 0;
        while (x >= 0 && y<length1){
            if (arr[y][x] == target){
                return true;
            }else if (arr[y][x] > target){
                x --;
            }else if (arr[y][x]<target){
                y++;
            }
        }
        return false;
    }
}
