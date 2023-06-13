package com.letcode;

public class _1722_findLadders {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        char[] chars = str1.toCharArray();
        char[] chars1 = str2.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int i1 = 0; i1 < chars1.length; i1++) {
                chars[i] = chars1[i1];
                for (char aChar : chars) {
                    System.out.print(aChar);
                }
                System.out.println();
            }
        }
    }
}
