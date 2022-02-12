package com.zhuanti.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question10 {
    private int num;
    private int target;
    public List<List<Integer>> threeSum(int[] nums) {
        num = nums.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(nums);
        su(arrayList,nums,0);
        return null;
    }

    public void su(ArrayList<Integer> arrayList,int nums[],int start){
        if (arrayList.size() == 2) {
//            System.out.println(Arrays.asList(arrayList));
            int num = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                num += arrayList.get(i);
            }
            if (num == target){
                System.out.println(Arrays.asList(arrayList));
            }
            return;
        }
        for (int i = start; i < nums.length; i++) {
            arrayList.add(nums[i]);
            su(arrayList,nums,i+1);
            arrayList.remove(arrayList.size()-1);
        }
    }
}
