package com.algorithmessentials;

/**
 * 给一个数组，将0移动道尾部
 */
public class _5_MoveZeros {
    public void moveZeros(int []arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                arr[index ++] = arr[i];
                arr[i] = 0;
            }
        }
    }
}
