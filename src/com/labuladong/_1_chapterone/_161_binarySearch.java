package com.labuladong._1_chapterone;

public class _161_binarySearch {
    public int binarySearch(int num[],int tatget){
        int left  = 0;
        int right = num.length - 1;
        while (left <= tatget) {
            int mid = (left + right)>>1;
            if (num[mid] == tatget) {
                return mid;
            } else if (num[mid] > tatget) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public int binarySearch1(int num[],int tatget){
        int left  = 0;
        int right = num.length - 1;
        while (left <= right) {
            int mid = (left + right)>>1;
            if (num[mid] == tatget) {
                if (mid == 0)return mid;
                if (num[mid-1]!=tatget)return mid;
                right = mid-1;
            } else if (num[mid] > tatget) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearch3(int num[],int tatget){
        int left  = 0;
        int right = num.length;
        while (left < right) {
            int mid = (left + right)>>1 ;
            if (num[mid] == tatget) {
                right = mid-1;
            } else if (num[mid] > tatget) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3};
        _161_binarySearch search = new _161_binarySearch();
        System.out.println(search.binarySearch3(arr, 2));
    }

    public int binarySearch2(int num[],int tatget){
        int left  = 0;
        int right = num.length - 1;
        while (left <= tatget) {
            int mid = (left + right)>>1;
            if (num[mid] == tatget) {

                left = mid+1;
            } else if (num[mid] > tatget) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
