package com.zhuanti.paixu;

import java.util.HashMap;
import java.util.Hashtable;

public class TopKFrequent {
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
