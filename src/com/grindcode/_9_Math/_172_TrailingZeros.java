package com.grindcode._9_Math;

public class _172_TrailingZeros {
    public int trailingZeros(int n){
        return n == 0 ? 0 : n /5 + trailingZeros(n / 5);
    }
}
