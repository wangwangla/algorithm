package com.zhuanti.string;

import java.util.HashSet;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
