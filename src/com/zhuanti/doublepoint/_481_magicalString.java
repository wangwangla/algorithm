package com.zhuanti.doublepoint;

/**
 * 122112
 * 1221121122
 * 1221
 */
public class _481_magicalString {
    public int magicalString(int n) {
        int i2 = 4;
        int i = n / i2;
        int i1 = i * 2;

        int i3 = n % i2;
        if (i3!=0){
            return i1 + 1;
        }
        return i1;
    }

    public static void main(String[] args) {
        _481_magicalString magicalString = new _481_magicalString();
        magicalString.magicalString(7);
    }
}
