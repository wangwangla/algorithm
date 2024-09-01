package com.sul.part1.sumdst;

public class QujianSum {
    public void quJianSum(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        //区间和
    }
}
