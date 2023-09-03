package com.algorithmessentials;

/**
 * 排序数组中某个元素最多n个
 */
public class _3_removeDuplicatesN {
    public int remoeDuplicates(int []arr,int n){
        if (arr.length<=n)return arr.length;
        int index = n;
        for (int i = n; i < arr.length; i++) {
            if (arr[i] != arr[index-n]) {
                arr[index++] = arr[i];
            }
        }
        return index;
    }
}
