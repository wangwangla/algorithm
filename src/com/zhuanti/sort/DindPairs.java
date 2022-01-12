package com.zhuanti.sort;

import com.zhuanti.duizhan.HannuoTa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class DindPairs {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int xx = 0;
        HashMap<Integer,Integer> hashMap = new HashMap();
        HashMap<String,String> xxx = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                String s = nums[i] + "-" + nums[hashMap.get(nums[i])];
                String s1 = nums[hashMap.get(nums[i])]+"-"+nums[i];
                if (!xxx.containsKey(s)||!xxx.containsKey(s1)){
                    continue;
                }
                xx++;
                xxx.put(nums[i]+"-"+nums[hashMap.get(nums[i])],null);
                xxx.put(nums[hashMap.get(nums[i])]+"-"+nums[i],null);
//                System.out.println(nums[i]+nums[hashMap.get(nums[i])]);
            }
            int i1 = nums[i] + k;
            hashMap.put(i1,i);
        }
        return xx;
    }


    public int findPairs1(int[] nums, int k) {
        Arrays.sort(nums);
        int xx = 0;
        HashMap<Integer,Integer> hashMap = new HashMap();
        int num2[] = new int[nums.length];
        int cc = 0;
        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num,null);
                num2[cc++] = num;
            }
        }
//        Integer.MIN_VALUE
        hashMap.clear();
        for (int i = 0; i < cc; i++) {
            if (hashMap.containsKey(num2[i])){
                xx++;
            }
            int i1 = num2[i] + k;
            hashMap.put(i1,i);
        }
        return xx;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,1,5,4};
        DindPairs pairs = new DindPairs();
        System.out.println(pairs.findPairs(arr, 0));
    }
}
