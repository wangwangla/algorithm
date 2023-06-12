package com.grindcode._12_string;

import java.util.HashMap;

public class _205_isIsomorphic {

    public static void main(String[] args) {
        String str1 = "paper";
        String str2 = "tiile";
        _205_isIsomorphic isIsomorphic = new _205_isIsomorphic();
        System.out.println(isIsomorphic.isIsomorphic(str1, str2));
    }

    public boolean isIsomorphic(String str1,String str2){
        HashMap<Character,Character> hashMap = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            char c1 = str2.charAt(i);
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, c1);
            }else {
                char character = hashMap.get(c);
                if (character != c1) {
                    return false;
                }
            }
        }
        return true;
    }
}
