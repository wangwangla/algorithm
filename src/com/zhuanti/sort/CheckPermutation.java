package com.zhuanti.sort;

import java.util.HashMap;
import java.util.Set;

public class CheckPermutation {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length())return false;
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            hashMap.put(s1.charAt(i),hashMap.getOrDefault(s1.charAt(i),0)+1);
        }
        for (int i = 0; i < s2.length(); i++) {
            hashMap.put(s2.charAt(i),hashMap.getOrDefault(s2.charAt(i),0)+1);
        }

        Set<Character> characters = hashMap.keySet();
        for (Character character : characters) {
            if (hashMap.get(character)!=0) {
                return false;
            }
        }
        return true;
    }
}
