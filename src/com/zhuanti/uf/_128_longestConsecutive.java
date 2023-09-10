package com.zhuanti.uf;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 */
public class _128_longestConsecutive {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (last==nums[i]){
             continue;
            } if (last+1 == nums[i]){
                count ++;
            }else {
                max = Math.max(count,max);
                count=1;
            }
            last = nums[i];
        }
        return Math.max(max,count);
    }

    public int longestConsecutive1(int[] nums) {
        if(nums.length==0)return 0;
        int max=0;
        int count = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num,num);
        }
        for (int num : nums) {
            count = 1;
            int temp = num;
            while (hashMap.containsKey(++temp))count++;
            temp = num;
            while (hashMap.containsKey(--temp))count++;
//            System.out.println(count);
            max = Math.max(count,max);
        }
        return max;
    }


    public static void main(String[] args) {
        int arr[] = {9,1,4,7,3,-1,0,5,8,-1,6};
        _128_longestConsecutive consecutive = new _128_longestConsecutive();
        System.out.println(consecutive.longestConsecutive(arr));
        System.out.println(consecutive.longestConsecutive1(arr));
    }
}
