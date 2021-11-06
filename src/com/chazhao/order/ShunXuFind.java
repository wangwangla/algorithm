package com.chazhao.order;

public class ShunXuFind {
    public int OrderFind(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
