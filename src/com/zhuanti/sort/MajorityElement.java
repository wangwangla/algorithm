package com.zhuanti.sort;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        MajorityElement element = new MajorityElement();
        element.majorityElement(arr);
    }
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int length = nums.length;
        int i = length / 3;
        Set<Integer> integers = hashMap.keySet();
        for (Integer integer : integers) {
            Integer integer1 = hashMap.get(integer);
            if (integer1>i){
                arrayList.add(integer1);
            }
        }
        return arrayList;
    }
}
