package com.shuati.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question11 {
    private int num;
    private int target;
    public List<List<Integer>> threeSum(int[] nums) {
        num = nums.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(nums);
//        su(arrayList,nums,0);
        return null;
    }
    int min = Integer.MAX_VALUE;
    int res = 0;
    public void su(ArrayList<Integer> arrayList,int nums[],int start,int target){
        if (arrayList.size() == 3) {
//            System.out.println(Arrays.asList(arrayList));
            int num = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                num += arrayList.get(i);
            }

            min = Math.min(Math.abs(num - target),min);
            if (min == Math.abs(num - target)){
                res = num;
            }
            if (num == target){
                System.out.println(Arrays.asList(arrayList));
            }
            return;
        }
        for (int i = start; i < nums.length; i++) {
            arrayList.add(nums[i]);
            su(arrayList,nums,i+1,target);
            arrayList.remove(arrayList.size()-1);
        }
    }

    public int threeSumClosest(int[] nums, int target) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(nums);
        su(arrayList,nums,0,target);
        return min;
    }
}
