package com.zhuanti.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 **/

public class _387_firstUniqChar {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> hashMapIndex = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
            Integer orDefault = hashMap.get(s.charAt(i));
            if (orDefault > 1) {
                hashMapIndex.remove(s.charAt(i));
            }
            hashMapIndex.put(s.charAt(i), i);
        }
        int min = -1;
        for (Character character : hashMapIndex.keySet()) {
            Integer integer = hashMapIndex.get(character);
            if (min != -1) {
                if (integer < min) {
                    min = integer;
                }
            } else {
                min = integer;
            }
        }

        return min;
    }

    class Info {
        char c;
        int po;
        public Info(char c,int po){
            this.c = c;
            this.po = po;
        }
    }

//    public int firstUniqChar1(String s) {
//        HashMap<Info,String > infoHashMap = new HashMap();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            infoHashMap.put(new Info(c,0),);
//        }
//        return 0;
//    }
}
