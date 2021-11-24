package com.zhuanti.hash;

import java.util.HashMap;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 滑动窗口了解一下
 */
public class Demo02 {
    public int lengthOfLongestSubstring(String s) {
        int max = - 1;
        int index = 0;
        char[] chars = s.toCharArray();
        HashMap<Character,Character> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = chars[i];
            //因为重复的不一定是开头
            while (hashMap.size()>0&&hashMap.containsKey(c)){
                hashMap.remove(chars[index]);
                index++;
            }
            hashMap.put(c,null);
            if (max < hashMap.size()){
                max = hashMap.size();
            }
        }
        System.out.println(max);
        return max;
    }

    public int lengthOfLongestSubstring1(String s) {
        s = "aabbaaaaaaa";
        int max = 0;
        int left = 0;
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = chars[i];
            if (hashMap.containsKey(c)){
                System.out.println(hashMap.get(c));
                left = Math.max(left,hashMap.get(c)+1);
            }
            //因为重复的不一定是开头
            hashMap.put(c,i);
//            if (max < hashMap.size()){
//                max = hashMap.size();
//            }
            max = Math.max(max,i-left + 1);
        }
        return max;
    }



    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        demo02.lengthOfLongestSubstring1("");
    }

}
