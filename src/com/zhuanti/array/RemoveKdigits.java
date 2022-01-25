package com.zhuanti.array;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveKdigits {
    public String removeKdigits(String num, int k) {
        Deque<Character> a = new LinkedList<>();
        for (char c : num.toCharArray()) {
            while (!a.isEmpty() &&k>0&& a.peek() > c){
                a.pop();
                k--;
            }
            a.push(c);
        }
        for (int i = 0; i < k; i++) {
            a.pop();
        }
        StringBuilder b = new StringBuilder();
        while (!a.isEmpty()) {
            Character character = a.pollLast();
            if (b.length()==0){
                if (character=='0') {
                    continue;
                }
            }
            b.append(character);
        }
        if (b.length() == 0) {
            return "0";
        }else {
            return b.toString();
        }
    }
}
