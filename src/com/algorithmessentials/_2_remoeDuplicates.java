package com.algorithmessentials;

/**
 * 数组中最多有两个
 *
 * 推广一下:
 * most n
 *
 */
public class _2_remoeDuplicates {
    public int remoeDuplicates(int []arr){
        if (arr.length<=2)return arr.length;
        int index = 2;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[index-2]) {
                arr[index++] = arr[i];
            }
        }
        return index;
    }
    public int remoeDuplicates1(int []arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            //如果存在三个   那就不对，继续向前走
            if (i>arr.length && i<arr.length-1&&arr[i]==arr[i-1]&&arr[i]==arr[i+1]){
                continue;
            }
            arr[index++] = arr[i];
        }
        return index;
    }
}


