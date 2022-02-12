package com.offer.rowoffer;

import java.util.HashMap;
import java.util.Set;

/**
 * 给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            }else {
                Integer integer = map.get(nums[i]);
                integer ++;
                map.put(nums[i],integer);
            }
        }
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            Integer integer1 = map.get(integer);
            if (integer1 == 1){
                return integer;
            }
        }
        return -1;
    }

    public int singleNumber1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            }else {
                Integer integer = map.get(nums[i]);
                integer ++;
                map.put(nums[i],integer);
            }
        }
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            Integer integer1 = map.get(integer);
            if (integer1 == 1){
                return integer;
            }
        }
        return -1;
    }
}
