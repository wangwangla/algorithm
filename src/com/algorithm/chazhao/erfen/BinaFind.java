package com.algorithm.chazhao.erfen;

public class BinaFind {
    public void binaFind(int arr[],int target){
        int mid = arr.length/2;
        int start = 0;
        int end = arr.length;
        while (start<end){
            if (arr[mid] == target){
                System.out.println(mid);
                return;
            }
            if (arr[mid]>target){
                end = mid-1;
                mid = ( start + end ) / 2;
            }else if (arr[mid]<target){
                start = mid + 1;
                mid = ( start + end ) / 2 ;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {
                1,2,3,4,5,6
        };
        BinaFind find = new BinaFind();
        find.binaFind(arr,2);
    }
}
