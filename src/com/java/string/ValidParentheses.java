package com.java.string;

public class ValidParentheses {
    public static boolean isValid(String s) {
        char ch[] = new char[s.length()];
        int head = 0 ;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    ch[head++] = c;
                    break;
                case ')':
                    if (head == 0 || ch[head] != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (head == 0 || ch[head] != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (head == 0 || ch[head] != '(') {
                        return false;
                    }
                    break;
            }
        }
        return head == 0;
    }
}
