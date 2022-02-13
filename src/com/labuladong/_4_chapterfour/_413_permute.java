package com.labuladong._4_chapterfour;

import java.util.ArrayList;

/**
 * 排列组合
 */
public class _413_permute {
    public void permute(int arr[]){
        int vv [] = new int[arr.length];
        ArrayList<Integer> arrayList = new ArrayList<>();
        su(arrayList,arr,vv);
    }

    public void su(ArrayList<Integer> arrayList,int arr[],int vv[]){
        if (arrayList.size()>2){
            System.out.println(arrayList);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (vv[i] == 1)continue;
            vv[i] = 1;
            arrayList.add(arr[i]);
            su(arrayList,arr,vv);
            arrayList.remove(arrayList.size()-1);
            vv[i] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        _413_permute permute = new _413_permute();
        permute.permute(arr);
    }
}
