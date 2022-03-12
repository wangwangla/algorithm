package com.grindcode._4_bina;

public class _34_FristAndEndPo {
    public static int left(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int mid = (left + right) >> 1;
            if (arr[mid] > target){
                right --;
            }else if (arr[mid] < target){
                left ++;
            }else {
                if (mid == 0){
                    return mid;
                }else {
                    if (arr[mid] == arr[mid - 1]){
                        right --;
                    }else {
                        return mid;
                    }
                }
            }
        }
        return right;
    }

    public static int right(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            int mid = (left + right) >> 1;
            if (arr[mid] > target){
                right --;
            }else if (arr[mid] < target){
                left ++;
            }else {
                if (mid == arr.length-1){
                    return mid;
                }else {
                    if (arr[mid] == arr[mid + 1]){
                        left ++;
                    }else {
                        return mid;
                    }
                }
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,1,1,2,3,4,5};
        System.out.println(left(arr, 1));
    }
}
