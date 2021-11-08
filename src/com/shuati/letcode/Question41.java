package com.shuati.letcode;

/**
 * @author:28188
 * @date: 2021/5/17
 * @time: 7:54
 *
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 *
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-a-2d-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question41 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        //先确定行
        int hang = matrix.length;
        int length = matrix[0].length;

        int index = 0;
        if (matrix[0][0]>target)return false;
        for (int i = 0; i < hang; i++) {
            if (matrix[i][0] == target)return true;
            if (matrix[i][0]>target) {
                index = i-1;
                break;
            }else{
                index = i;
            }
        }
        //在确定列
        for (int i = 0; i < length; i++) {
            if (matrix[index][i]==target)return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        searchMatrix(arr,3);
    }
}
