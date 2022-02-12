package com.zhuanti.string;

public class LongestPalindrome {
    //奇数的处理方法
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c]++;
        }

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            //v为奇数   并且ans必须要为偶数   结论：只有一个是奇数
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        longestPalindrome.longestPalindrome1("AAAA");
    }

    public int longestPalindrome1(String s) {
        int[] count = new int[57];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c-'A']++;
        }

        int xx = 0;
        for (int i : count) {
            xx += (i%2);
        }

        return xx == 0 ? s.length() : (s.length() - xx + 1);
    }

}
