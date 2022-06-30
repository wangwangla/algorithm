package com.algorithmessentials;

/**
 * 给一个排序的数组，删除元素，使得每一项只有一个，返回新的长度
 *
 * example:
 * A=[1,1,2];
 * > rA[1，2]   2
 */
public class _1_RemoveDuplicatesFromArray {
    public int remoeDuplicates(int arr[]){
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]){
                arr[index++] = arr[i];
            }
        }
        return index+1;
    }
}
