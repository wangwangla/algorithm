package com.grindcode._3_doublepoint;

public class _88_Merge {
    public void merge(int arr1[],int m,int arr2[],int n){
        int pos = m + n - 1;
        m--;
        n--;
        while (m>=0&&n>=0){
            arr1[pos--] = arr1[m] > arr2[n] ? arr1[m--] : arr2[n--];
        }
        while (n>=0){
            arr1[pos--] = arr2[n--];
        }
    }
}
