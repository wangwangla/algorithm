package com.algorithmessentials;

/**
 * 排序数组中不重复的个数
 */
public class _4_RemoveEelement {
    public int removeEelement(int arr[],int target){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target){
                arr[index++] = arr[i];
            }
        }
        return index;
    }
}
