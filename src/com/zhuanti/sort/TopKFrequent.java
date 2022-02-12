package com.zhuanti.sort;

import java.util.Arrays;
import java.util.HashMap;

public class TopKFrequent {
    public int[] topKFrequent1(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }
        int index = 0;
        int aa [] = new int[hashMap.size()];
        for (Integer integer : hashMap.keySet()) {
            aa[index++] = hashMap.get(integer);
        }
        Arrays.asList(aa);
        int xxx[] = new int[k];
        if (k>aa.length){
            return aa;
        }
        for (int i = 0; i < k; i++) {
            int i1 = aa[aa.length - 1 - i];
            xxx[i] = i1;
        }
        return xxx;
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            int count = 1;
            if (hashMap.containsKey(num)){
                count = hashMap.get(num);
            }
            hashMap.put(num,count);
        }
        xx(hashMap);
        return null;
    }
    public void xx(HashMap hashMap){
        int size = hashMap.size();
//        for (int i = 0; i < size - 1; i++) {
//            for (int i1 = 0; i1 < size-1 - i; i1++) {
//
//            }
//        }
    }
}
