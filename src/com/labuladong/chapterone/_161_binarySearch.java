package com.labuladong.chapterone;

public class _161_binarySearch {
    public int binarySearch(int num[],int tatget){
        int left  = 0;
        int right = num.length - 1;
        while (left <= tatget) {
            int mid = left + right;
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
        while (left <= tatget) {
            int mid = left + right;
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
    public int binarySearch2(int num[],int tatget){
        int left  = 0;
        int right = num.length - 1;
        while (left <= tatget) {
            int mid = left + right;
            if (num[mid] == tatget) {
                if (mid == num.length-1)return mid;
                if (num[mid-1]!=tatget)return mid;
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
