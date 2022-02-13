package com.labuladong._4_chapterfour;

import java.util.ArrayList;
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

    public static void main(String[] args) {
        _461_NNum nNum = new _461_NNum();
        int arr[] = new int[]{-1,0,1,2,-1,-4};
        nNum.threeSum(arr);
    }
    public void threeSum(int arr[]){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int t[] = new int[arr.length];
        xxx(arr,arrayList,t);
        System.out.println(xxks);
    }

    private int xxks = 0;
    private void xxx(int arr[],ArrayList<Integer> arrayList,int[]dp){
        if (arrayList.size() == 3){
            int sum = 0;
            for (Integer integer : arrayList) {
                sum += integer;
            }
            if (sum == 0){
                xxks++;
            }
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (dp[i] == 1)continue;
            dp[i] = 1;
            arrayList.add(arr[i]);
            xxx(arr,arrayList,dp);
            arrayList.remove(arrayList.size()-1);
            dp[i] = 0;
        }
    }
}
