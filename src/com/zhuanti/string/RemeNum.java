package com.zhuanti.string;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class RemeNum {
    public String removeKdigits(String num, int k) {
        Deque<Character> deque = new LinkedList<>();
        int length = num.length();
        for (int i = 0; i < length; ++i) {
            char digit = num.charAt(i);
            while (!deque.isEmpty() && k > 0 && deque.peekLast() > digit) {
                deque.pollLast();
                k--;
            }
            deque.offerLast(digit);
        }

        for (int i = 0; i < k; ++i) {
            deque.pollLast();
        }

        StringBuilder ret = new StringBuilder();
        boolean leadingZero = true;
        while (!deque.isEmpty()) {
            char digit = deque.pollFirst();
            if (leadingZero && digit == '0') {
                continue;
            }
            leadingZero = false;
            ret.append(digit);
        }
        return ret.length() == 0 ? "0" : ret.toString();
    }

    private String xx(String str,int k){
        Stack<Character> a = new Stack<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            while (!a.isEmpty()&&k>0&&a.peek()>aChar){
                a.pop();
                k --;
            }
        }

        for (int i = 0; i < k; i++) {
            a.pop();
        }

        StringBuilder b = new StringBuilder();
        while (!a.isEmpty()) {
            Character character = a.pop();
//            if (b.length()==0){
//                if (character=='0') {
//                    continue;
//                }
//            }
            b.insert(0,character);
        }
        if (b.length() == 0) {
            return "0";
        }else {
            //
            return b.toString();
        }
    }

    public static void main(String[] args) {
        RemeNum num = new RemeNum();
        num.removeKdigits("1999999999999",4);
    }
}
