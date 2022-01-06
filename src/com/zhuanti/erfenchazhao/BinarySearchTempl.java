package com.zhuanti.erfenchazhao;

public class BinarySearchTempl {
    public int binarySearch(int arr[],int target){
        int low = 0;
        int hight = arr.length-1;
        int mid = low + hight >> 1;
        while (low <= hight){
            mid = low + hight >> 1;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] > target){
                hight = mid - 1;
            }else {
                low = mid - 1;
            }
        }
        return -1;
    }
}
