package com.sul.part1.ordernum;

import com.beust.ah.A;

public class App {
    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        App app = new App();
        app.sortedSquares(nums);
    }

    public void sortedSquares(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int result[] = new int[right+1];
        int index = right;
        while (left<=right){
            if (arr[left]*arr[left] >= arr[right]*arr[right]){
                result[index--] = arr[left] * arr[left];
                left++ ;
            }else {
                result[index--] = arr[right] * arr[right];
                right --;
            }
        }
        for (int i : result) {
            System.out.println(i+"  ");
        }
    }
}
