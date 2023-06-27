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
            //如果是排好序的，只需要比较相邻的
            if (arr[i] != arr[index-1]){
                arr[index++] = arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        _1_RemoveDuplicatesFromArray fromArray = new _1_RemoveDuplicatesFromArray();
        int arr[] = new int[] {1,9,3,2};
        System.out.println(fromArray.remoeDuplicates(arr));
    }
}
