package com.letcode;

/**
 * 将一个数组  映射到另一个维度的数组
 *
 * [
 *  [1,2,3],
 *  [4,5,6]
 * ]
 *
 * =>
 *
 * 1 2 3 4
 */
public class _566_Reshape {
    public static void main(String[] args) {
        _566_Reshape reshape = new _566_Reshape();
        reshape.reShape();
    }

    public void reShape(){
        int arr[][] = {{1,2,3,4,5,6}};
        int target [][] = new int[2][3];
        int i = arr.length * arr[0].length;
        for (int i1 = 0; i1 < i; i1++) {
            set(target,i1,getValue(arr,i1));
        }
        for (int[] ints : target) {
            for (int anInt : ints) {
                System.out.print(anInt+"    ");
            }
            System.out.println();
        }
    }

    public int getValue(int arr[][],int i){
        int row = arr.length;
        int line = arr[0].length;

        int i1 = i / line;
        int i2 = i % line;

        return arr[i1][i2];
    }

    public void set(int target[][],int i,int value){
        int row = target.length;
        int line = target[0].length;

        int i1 = i / line;
        int i2 = i % line;

        target[i1][i2]  = value;
    }
}
