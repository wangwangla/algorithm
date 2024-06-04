package com.offer.rowoffer;

public class _53_searchNum {
    public int searchNum (int [] num,int target){
        return leftBound(num,target) - rightBound(num,target);
    }

    public int leftBound(int numarr[],int target){
        int left = 0;
        int right = numarr.length - 1;
        while (left<=right){
            int mid = left + (left + right) / 2;
            if(numarr[mid] < target){
                left = mid + 1;
            }else if (numarr[mid]>target){
                right = mid - 1;
            }else {
                right = mid - 1;
            }
        }

        if (numarr[left] != target && left>=numarr.length){
            return -1;
        }
        return left;
    }

    public int rightBound(int numarr[],int target){
        int left = 0;
        int right = numarr.length - 1;
        while (left<=right){
            int mid = left + (left + right) / 2;
            if(numarr[mid] < target){
                left = mid + 1;
            }else if (numarr[mid]>target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        if (numarr[right] != target && right<0){
            return -1;
        }
        return right;
    }

}
