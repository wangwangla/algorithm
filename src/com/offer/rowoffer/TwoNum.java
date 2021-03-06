package com.offer.rowoffer;

import java.util.HashMap;
import java.util.HashSet;

public class TwoNum {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int arr[] = new int[2];
        while (right > left){
            int i = numbers[left] + numbers[right];
            if (i == target)break;
            if (i > target){
                right--;
            }else if (i<target){
                left ++;
            }
        }
        arr[0] = left;
        arr[1] = right;
        return arr;
    }

    public int[] twoSum1(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int arr[] = new int[2];
        while (right > left){
            int i = numbers[left] + numbers[right];
            if (i == target)break;
            if (i > target){
                right = right / 2;
            }else if (i<target){
                left ++;
            }
        }
        arr[0] = left;
        arr[1] = right;
        return arr;
    }

    public int[] towSum2(int []numbers,int taget){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int ke = taget - number;
            if (hashMap.containsKey(ke)){
                return new int[]{i,hashMap.get(ke)};
            }
            hashMap.put(number,i);
        }
        return null;
    }
}
