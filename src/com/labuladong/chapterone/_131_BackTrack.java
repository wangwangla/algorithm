package com.labuladong.chapterone;

import com.beust.ah.A;

import java.util.ArrayList;

public class _131_BackTrack{
    int backTrack(int []arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        backTrack(arr,arrayList);
        return 0;
    }

    private void backTrack(int[] arr, ArrayList<Integer> arrayList) {
        //结束条件
        if (false){

        }

        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
            backTrack(arr,arrayList);
            arrayList.remove(arrayList.size() - 1);
        }
    }


    /**
     * 全排列
     *
     * 去重优化
     * @param arr
     * @param arrayList
     */
    private void backTrack1(int[] arr, ArrayList<Integer> arrayList) {
        //结束条件
        if (arrayList.size() == 3){
            System.out.println(arrayList);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arrayList.contains(arr[i]))continue;
            arrayList.add(arr[i]);
            backTrack1(arr,arrayList);
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /**
     * 八皇后
     * @param args
     */

    public static void main(String[] args) {
        _131_BackTrack backTrack = new _131_BackTrack();
        ArrayList<Integer> arrayList = new ArrayList<>();
        backTrack.backTrack1(new int[]{1,2,3},arrayList);
    }
}
