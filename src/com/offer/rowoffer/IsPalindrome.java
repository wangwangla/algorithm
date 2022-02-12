package com.offer.rowoffer;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char aChar : chars) {
            if (aChar>='a'&&aChar<='z'||aChar>='A'&&aChar<='Z'){
                builder.append(Character.toUpperCase(aChar));
            }else if (aChar>='0'&&aChar<='9'){
                builder.append(aChar);
            }
        }
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) != builder.charAt(builder.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome p = new IsPalindrome();
        p.isPalindrome("A man, a plan, a canal: Panama");
    }
}
