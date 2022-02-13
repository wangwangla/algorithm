package com.labuladong._4_chapterfour;

public class _471_Calulate {
    public void zh(int arr[]){
        String s = "456";
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            n = 10 * n + (c-'0');
        }
    }
}
