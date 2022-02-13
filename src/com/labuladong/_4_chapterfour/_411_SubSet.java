package com.labuladong._4_chapterfour;

import java.util.ArrayList;

public class _411_SubSet {
    /**
     * 子集
     *
     * 不包含重复数字的数组，返回所有的子集
     * @param arr
     */
    public void subSet(int arr[]){
        ArrayList<Integer> arrayList = new ArrayList<>();
        su(arrayList,arr,0);
        return;
    }

    public void su(ArrayList<Integer> arrayList,int arr[],int start){
        System.out.println(arrayList);
        for (int i = start; i < arr.length; i++) {
            arrayList.add(arr[i]);
            su(arrayList,arr,i+1);
            arrayList.remove(arrayList.size()-1);
        }
    }

    public static void main(String[] args) {
        _411_SubSet subSet = new _411_SubSet();
        int arr[] = {1,2,3,4};
        subSet.subSet(arr);
    }
}
