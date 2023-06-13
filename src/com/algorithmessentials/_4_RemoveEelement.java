package com.algorithmessentials;

public class _4_RemoveEelement {
    public int removeEelement(int arr[],int target){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target){
                arr[index++] = arr[i];
            }
        }
        return index;
    }
}
