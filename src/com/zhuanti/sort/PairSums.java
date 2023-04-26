package com.zhuanti.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSums {
    public List<List<Integer>> pairSums(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start<end){
            if (nums[start]+nums[end] > target){
                end --;
            }else if (nums[start]+nums[end] < target){
                start ++;
            }else {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(nums[start]);
                arrayList.add(nums[end]);
                list.add(arrayList);
//                System.out.println(nums[start] + "-------" + nums[end]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {5,6,5};
        PairSums sums = new PairSums();
        sums.pairSums(arr,11);
    }
}
