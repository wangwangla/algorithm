package com.rowoffer;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        int index = 0;
        HashMap<Character,Character> h = new HashMap<>();
        for (char aChar : chars) {
            while (h.size()>0 && h.containsKey(aChar)){
                h.remove(chars[index]);
                index ++;
            }
            h.put(aChar,null);
            if (h.size()>max)max = h.size();
        }
        return max;
    }
}
