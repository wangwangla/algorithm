package com.letcode;

/**
 * 0  1
 * 1  9
 * 2  91
 * 3
 */
public class _357_countNumbersWithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1; //0
        }
        if (n == 1) {
            return 10;//0-9
        }

        /**
         * 第一个有9种
         * 第二个有9种
         * 第三个有8
         */
        int res = 10, cur = 9;
        for (int i = 0; i < n - 1; i++) {
            cur *= 9 - i;
            res += cur;
        }
        return res;
    }

    public int countNumbersWithUniqueDigits1(int n) {
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 10;
        }
        int res = 10;
        int cur = 9;
        for (int i = 0; i < n - 1; i++) {
            cur *= 9 - i;
            res += cur;
        }
        return res;
    }
}