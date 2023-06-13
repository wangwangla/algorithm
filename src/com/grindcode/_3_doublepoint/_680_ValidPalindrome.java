package com.grindcode._3_doublepoint;

public class _680_ValidPalindrome {
    public boolean validPalindrome(String s) {
        int length = s.length();
        int left = 0;
        int right = length-1;
        while (left<=right){
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else {
               return is(s,left+1,right) || is(s,left,right+1);
            }
        }
        return true;
    }

    boolean is(String s,int left,int right){
        while (left<=right){
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
}
