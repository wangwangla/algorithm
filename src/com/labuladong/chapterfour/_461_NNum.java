package com.labuladong.chapterfour;

import java.util.Arrays;

public class _461_NNum {
    public void twoSum(int[] arr,int target){
        Arrays.sort(arr);
        int lo = 0;
        int hi = arr.length - 1;

        while (lo < hi){
            int sum = arr[lo] + arr[hi];
            if (sum < target){
                lo ++;
            }else if (sum > target){
                hi --;
            }else if (sum == target){
                System.out.println();
                return;
            }
        }
    }

    public void twoSum1(int arr[],int  target){
        Arrays.sort(arr);
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi){
            int sum = arr[lo] + arr[hi];
            int left = arr[lo];
            int right = arr[hi];
            if (sum < target){
                lo ++;
            }else if (sum > target){
                hi --;
            }else {
                System.out.println("----");
                while (lo<hi&&arr[lo]==left)lo++;
                while (lo<hi&&arr[lo]==right)hi++;
            }
        }
    }
}
