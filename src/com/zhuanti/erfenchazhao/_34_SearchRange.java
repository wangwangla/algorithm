package com.zhuanti.erfenchazhao;

public class _34_SearchRange {
    public int[] searchRange(int []arr,int target){
        return null;
    }

    public int leftRange(int []arr,int target){
        int begin = 0;
        int end = arr.length - 1;
        while (begin<=end){
            int mid = begin + (end - begin) >> 1;
            if (arr[mid] > target){
                end = mid - 1;
            }else if (arr[mid] < target){
                begin = mid + 1;
            }else {
                if (mid==0||arr[mid]!=arr[mid-1]){
                    return mid;
                }
                end = mid-1;
            }
        }
        return 0;
    }

    public int rightRange(int []arr,int target){
        int begin = 0;
        int end = arr.length - 1;
        while (begin<=end){
            int mid = begin + (end - begin) >> 1;
            if (arr[mid] > target){
                end = mid - 1;
            }else if (arr[mid] < target){
                begin = mid + 1;
            }else {
                if (mid==arr.length-1 || arr[mid]!=arr[mid+1]){
                    return mid;
                }
                begin = mid + 1;
            }
        }
        return 0;
    }
}
