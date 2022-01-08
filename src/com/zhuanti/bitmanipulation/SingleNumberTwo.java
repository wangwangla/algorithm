package com.zhuanti.bitmanipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SingleNumberTwo {

    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
                set.put(nums[i],set.getOrDefault(nums[i],0)+1);

        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : set.entrySet()) {
            if (integerIntegerEntry.getValue() == 1){
                return integerIntegerEntry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,3,2};
        SingleNumberTwo two = new SingleNumberTwo();
        two.singleNumber(arr);
    }
}
