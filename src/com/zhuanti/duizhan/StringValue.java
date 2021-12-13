package com.zhuanti.duizhan;

import java.util.Stack;

public class StringValue {
    public static void main(String[] args) {
        String ss = "(])";
        StringValue stringValue = new StringValue();
        stringValue.isValid(ss);
    }

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar == '('||aChar=='['||aChar == '{') {
                stack.add(aChar);
            }else {
                if (stack.isEmpty()){
                    continue;
                }
                if (aChar == ')'){
                    if ('('==stack.peek()){
                        stack.pop();
                        num = num + 2;
                    }else {
                        stack.add(aChar);
                    }
                }
            }
        }
        return false;
    }
}
