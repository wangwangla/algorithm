package com.grindcode._5_sort;

/**
 * 快排：
 * 分两半  然后进行合并
 */
public class _001_QuickSort {
    public void sort(int arr[],int left,int right){
        if (left>right){
            return;
        }
        int frist = left;
        int end = right - 1;
        int key = arr[frist];
        while (frist < end){
            while (frist<end && arr[end]>=key){
                --end;
            }

        }
    }
}
