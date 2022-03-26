package com.grindcode._4_bina;

public class _81_Search {
    public static void search(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = ( start + end ) >> 1;
            if (arr[mid] == target){
                return;
            }
            if (arr[start] == arr[mid]){
                start++;
            }else if (arr[mid] <= arr[end]){
                if (arr[mid]<target && arr[mid] >= target){
                    start = mid + 1;

                }else {
                    end = mid - 1;
                }
            }else {
//                if (arr[start] <= )
            }
        }
    }

    public static void main(String[] args) {

    }
}
