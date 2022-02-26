package com.zhuanti.array;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class _387_firstUniqChar {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        HashMap<Character,Integer> hashMapIndex = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
            Integer orDefault = hashMap.get(s.charAt(i));
            if (orDefault>1) {
                hashMapIndex.remove(s.charAt(i));
            }
            hashMapIndex.put(s.charAt(i), i);
        }
        int min = -1;
        for (Character character : hashMapIndex.keySet()) {
            Integer integer = hashMapIndex.get(character);
            if (min!=-1){
                if (integer<min){
                    min=integer;
                }
            }else{
                min = integer;
            }
        }

        return min;
    }
}
