package com.zhuanti.doublepoint;

public class _151_ReverseWords {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        int start = 0;
        int end = s1.length-1;

        while (start < end){
            String s2 = s1[start];
            s1[start] = s1[end];
            s1[end] = s2;
            start++;
            end--;
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s1.length; i++) {
            String s2 = s1[i];
            s2  = s2.trim();
            if(s2.equals(""))continue;
            stringBuilder.append(s2);
            stringBuilder.append(" ");
        }
//        for (String s2 : s1) {
//            stringBuilder.append(s2);
//            stringBuilder.append(" ");
//        }
        stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length());
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        String ss = "  hello world  ";
        _151_ReverseWords reverseWords = new _151_ReverseWords();
        System.out.println(reverseWords.reverseWords(ss));
    }
}
