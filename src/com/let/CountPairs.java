package com.let;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CountPairs {
    public long countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int i1 = i+1; i1 < nums.length; i1++) {
                System.out.println(nums[i]*nums[i1]);
                long xx = nums[i]*nums[i1];
                if  (xx %  2==0){
                    count ++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountPairs pairs = new CountPairs();
        pairs.countPairs(new int[]{1,2,3,4,5},0);
    }
}
