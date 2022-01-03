package com.zhuanti.array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 1-twoSum
 *
 * 解题思路：
 * 每次存储需要找出的目标值，如果出现目标值，那么就取出下标并返回。
 */
public class OneTwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (hashMap.containsKey(num)){
                arr[0] = i;
                arr[1] = hashMap.get(num);
                break;
            }
            hashMap.put(target-num,i);
        }
        return arr;
    }
}
