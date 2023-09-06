package com.algorithmessentials;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 一个没有排序的数组，最长的连续序列
 *
 * 先排序  在做
 *
 * 使用hash，判断hash中是否有值
 * 123456
 */
public class _3_LongestConsecutiveSeq {
    //分一下  先求出如果是有序的
    public int longest(int []num){
        if (num.length<=0)return 0;
        int len = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i-1] + 1) {
                len++;
            } else {
                max = Math.max(len,max);
                len = 1;
            }
        }
        //最后一次
        max = Math.max(len,max);
        return max;
    }

    public int longest1(int []num){
        if (num.length<=0)return 0;
        int len = 0;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : num) {
            hashSet.add(i);
        }

        for (int i = 1; i < num.length; i++) {
            len = 1;
            int vv = num[i];
            for (int i1 = vv-1; hashSet.contains(i1); i1--) {
                len ++;
                hashSet.remove(i1);
            }
            for (int i1 = vv+1; hashSet.contains(i1); i1++) {
                len ++;
                hashSet.remove(i1);
            }
            max = Math.max(max,len);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr [] ={1,2,3,5,6};
        _3_LongestConsecutiveSeq seq = new _3_LongestConsecutiveSeq();
        System.out.println(seq.longest(arr));
    }


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

    /**
     * O(n)的时候就考虑一下  hash然后从当中删除元素
     * @param nums
     * @return
     */
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
