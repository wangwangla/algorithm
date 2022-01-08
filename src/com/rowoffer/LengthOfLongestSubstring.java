package com.rowoffer;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        int index = 0;
        HashMap<Character, Character> h = new HashMap<>();
        for (char aChar : chars) {
            while (h.size() > 0 && h.containsKey(aChar)) {
                h.remove(chars[index]);
                index++;
            }
            h.put(aChar, null);
            if (h.size() > max) max = h.size();
        }
        return max;
    }

    //复习
    public int lengthOfLongestSubstring1(String s) {
        char[] chars = s.toCharArray();
        int deleteIndex = 0;
        int max = 0;
        HashMap<Character,Character> hashMap = new HashMap<>();
        for (char aChar : chars) {
            if (hashMap.size()>0 && hashMap.containsKey(aChar)){
                hashMap.remove(chars[deleteIndex]);
                deleteIndex++;
            }
            hashMap.put(aChar,null);
            if (hashMap.size() > max)
                max = hashMap.size();
        }
        return max;
    }

    /**
     * 优化   不存储    直接使用两个指针进行
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring3(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            for (int i1 = start; i1 < i; i1++) {
                if (aChar == chars[i1]){
                    start = i1+1;
                }
            }
            max = Math.max(max,i-start+1);
        }
        return max;
    }

    public static void main(String[] args) {
        String aa = "au";
        LengthOfLongestSubstring substring = new LengthOfLongestSubstring();
        substring.lengthOfLongestSubstring3(aa);
    }
}