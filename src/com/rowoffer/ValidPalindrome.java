package com.rowoffer;

public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            if (start>=end)break;
            start = i;
            end = chars.length - 1 - i;
            if (s.charAt(start) != s.charAt(end)){
                return isPalindrome(s,start+1,end) || isPalindrome(s,start,end-1);
            }
        }
        return true;
    }

    public boolean validPalindrome1(String s) {
        for(int left = 0, right = s.length() - 1; left < right; left++, right--){
            // 如果不相等，则分两种情况：删除左边的元素，或者右边的元素，再判断各自是否回文，满足一种即可。
            if(s.charAt(left) != s.charAt(right))
                return isPalindrome(s, left+1, right) || isPalindrome(s, left, right - 1);
        }
        return true;
    }

    // 判断字符串 s 的 [left, right] 是否回文
    private boolean isPalindrome1(String s, int left , int right){
        while (left < right){
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }

    public boolean isPalindrome(String s,int start,int end){
        while (start<end){
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        validPalindrome.validPalindrome("abca");
        System.out.println();
    }
}
