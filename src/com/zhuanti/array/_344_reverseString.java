package com.zhuanti.array;

public class _344_reverseString {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char c = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = c;
        }
    }
}
