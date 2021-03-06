package com.labuladong._4_chapterfour;

import java.util.ArrayList;

public class _412_ComBine {
    public void comBine(int arr[]){
        ArrayList<Integer> arrayList = new ArrayList<>();
        su(arrayList,0,arr,2);
    }

    public void su(ArrayList<Integer> arrayList,int start,int arr[],int target){
        if (arrayList.size() == target){
            System.out.println(arrayList);
            return;
        }
        for (int i = start; i < arr.length; i++) {
            arrayList.add(arr[i]);
            su(arrayList,i,arr,target);
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        _412_ComBine comBine = new _412_ComBine();
        comBine.comBine(arr);
    }
}
