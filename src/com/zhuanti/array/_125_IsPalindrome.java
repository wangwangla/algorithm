package com.zhuanti.array;

public class _125_IsPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c>='a'&&c<='z' || c>='A'&&c<='Z'){
                builder.append(c);
            }
        }
        for (int i = 0; i < builder.length() / 2; i++) {
            if (builder.charAt(i)!=builder.charAt(builder.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
        String s = "ABCDCBA";

        _125_IsPalindrome palindrome = new _125_IsPalindrome();
        System.out.println(palindrome.isPalindrome(s));
    }
}
