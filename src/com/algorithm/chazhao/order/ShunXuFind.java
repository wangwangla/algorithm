package com.algorithm.chazhao.order;

public class ShunXuFind {
    public int OrderFind(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,6,4,6};
        ShunXuFind find = new ShunXuFind();
        System.out.println(find.OrderFind(arr, 6));
    }
}
