package com.algorithm._6_chazhao.erfen;

public class BinaFind {
    public void binaFind(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = ( start + end ) / 2;
            if (arr[mid] == target){
                System.out.println(mid);
                return;
            }else if (arr[mid]>target){
                end = mid-1;
            }else if (arr[mid]<target){
                start = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {
                1,2,3,4,5,6
        };
        BinaFind find = new BinaFind();
        find.binaFind(arr,6);
    }
}
