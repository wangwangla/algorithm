package com.zhuanti.bitmanipulation;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public int majorityElement1(int[] nums) {
        int length = nums.length;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
            if (hashMap.get(num)>length/2){
                return num;
            }
        }
        return 0;
    }

    public int majorityElement2(int[] nums) {
        int count = 0;
        int cc = -1;
        for (int num : nums) {
            if (count == 0){
                cc = num;
            }
            if (cc == num){
                count+=1;
            }else {
                count-=1;
            }
        }
        return cc;
    }

}
