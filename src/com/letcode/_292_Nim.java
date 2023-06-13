package com.letcode;

/**
 * n个石头，每次取1-3，取最后一个石头的success   作为先手
 */
public class _292_Nim {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
