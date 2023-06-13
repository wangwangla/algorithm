package com.letcode;

public class _125_isPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                builder.append(Character.toUpperCase(c));
            }
        }
        String s1 = builder.toString();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome1(String s) {
            int left = 0;
            int right = s.length() - 1;
            char leftChar;
            char rightChar;
            while (left<right){
                while (true){
                    leftChar = s.charAt(left++);
                    if (Character.isLetterOrDigit(leftChar)) {
                        break;
                    }
                    if (left>s.length()){
                        break;
                    }
                }
                while (true){
                    rightChar = s.charAt(right--);
                    if (Character.isLetterOrDigit(rightChar)) {
                        break;
                    }

                    if (right<0){
                        break;
                    }
                }

                if (Character.toUpperCase(leftChar) != Character.toUpperCase(rightChar)){
                    return false;
                }
            }


            return true;
        }

    public static void main(String[] args) {
//        String str = "A man, a plan, a canal: Panama";
        String str = "a.";
        _125_isPalindrome palindrome = new _125_isPalindrome();
        System.out.println(palindrome.isPalindrome(str));
    }
}
