package com.zhuanti.erfenchazhao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Intersection {
    public int[] intersection(int[] nums1,int []nums2){
        HashSet<Integer> list = new HashSet<>();
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i : nums1) {
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        for (int i : nums2) {
            if (hashMap.containsKey(i)) {
                Integer orDefault = hashMap.get(i);
                orDefault--;
                list.add(i);

                if (orDefault>0){
                    hashMap.put(i,orDefault);
                }else {
                    hashMap.remove(i);
                }
            }
        }
        int index = 0;
        int num[] = new int[list.size()];
        for (Integer integer : list) {
            num[index++] = integer;
        }
        return num;
    }
}
