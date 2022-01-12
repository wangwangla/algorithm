package com.zhuanti.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.logging.Handler;

public class ThirdMax {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> s = new TreeSet<Integer>();
        for (int num : nums) {
            s.add(num);
            if (s.size() > 3) {
                s.remove(s.first());
            }
        }
        return s.size() == 3 ? s.first() : s.last();
    }

//    public int thirdMax1(int[] nums) {
//        Arrays.sort(nums);
//        HashMap hashMap = new HashMap();
//        for (int i = 0; i < nums.length; i++) {
//            int cc = nums[nums.length-1-i];
//            hashMap.put(cc,0);
//            if (hashMap.size()==3){
//                break;
//            }
//        }
//        return hashMap.size() == 3 ? s.first() : s.last();
//    }
}
