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
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8};
        BinarySearchTempl templ = new BinarySearchTempl();
        System.out.println(templ.binarySearch(arr, 8));
    }
}
