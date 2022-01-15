package com.zhuanti.sort;

import java.util.HashSet;

public class IsUnique {
    public boolean isUnique(String astr) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            if (!hashSet.contains(astr.charAt(i))) {
                hashSet.add(astr.charAt(i));
            }else {
                return false;
            }
        }
        return true;
    }
}
