package com.algorithmessentials;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 一个没有排序的数组，最长的连续序列
 */
public class _3_LongestConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int num = 1;
        int maxLenth = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]+1 == nums[i+1]){
                num ++;
            }else {
                maxLenth = Math.max(maxLenth,num);
                num=1;
            }
        }
        return maxLenth;
    }

    public int longestConsecutive1(int[] nums) {
        final HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        int longest = 0;
        for (int i1 = 0; i1 < nums.length; i1++) {
            int i = nums[i1];
            int length = 1;
            for (int j = i-1;hashSet.contains(j);--j){
                hashSet.remove(j);
                ++length;
            }
            for (int j = i+1;hashSet.contains(j);++j){
                hashSet.remove(j);
                ++length;
            }
            longest = Math.max(longest,length);
        }
        return longest;
    }


}
