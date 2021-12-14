package com.zhuanti.duizhan;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxValueK {
    public static void main(String[] args) {
        MaxValueK k = new MaxValueK();
        k.longestValidParentheses("(()");
    }
    public int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        Deque<Integer> deque = new LinkedList<>();
        int max = 0;
        deque.push(-1);
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar == '('){
                deque.push(i);
            }else {
                deque.pop();
                if (deque.isEmpty()){

                    deque.push(i);
                }else {
                    max = Math.max(max,i - deque.peek());
                }
            }
        }
        return max;
    }
}
