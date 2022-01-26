package com.labuladong.chapterfour;

import java.util.HashMap;

public class _451_TwoSum {
    public int[] sum(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public int[] sum1(int [] nums,int target){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target-nums[i])){
                if (i!=hashMap.get(target-nums[i])){
                    return new int[]{i,hashMap.get(target-nums[i])};
                }
            }
        }
        return new int[]{-1,-1};
    }

    HashMap<Integer,Integer> fr = new HashMap<>();

    public void add(int number){
        fr.put(number,fr.getOrDefault(number,0)+1);
    }

    public boolean find(int value){
        for (Integer integer : fr.keySet()) {
            int other = value - integer;
            if (other == value){
                if (fr.get(value) > 0) {
                    return true;
                }
            }
            if (other != integer && fr.containsKey(other)){
                return true;
            }
        }
        return false;
    }
}
