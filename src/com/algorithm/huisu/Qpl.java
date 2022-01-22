package com.algorithm.huisu;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Qpl {
    public int Qpl(int arr[],int n){
        ArrayList<Integer> arrayList = new ArrayList<>();
        xx(arrayList,arr,n);
       return 0;
    }

    public static void main(String[] args) {
        Qpl qpl = new Qpl();
        int arr[] = {1,2,3};
        qpl.Qpl(arr,0);
    }

    public int xx(ArrayList<Integer> arrayList,int arr[],int n){
        if (arrayList.size() == 3){
            System.out.println(arrayList);
            return 0;
        }
        for (int i = 0; i < 3; i++) {
            if (arrayList.contains(arr[i]))continue;
            arrayList.add(arr[i]);
            xx(arrayList,arr,i+1);
            arrayList.remove(arrayList.size()-1);
        }
        return 0;
    }
}
