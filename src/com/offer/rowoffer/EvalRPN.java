package com.offer.rowoffer;

import java.util.Deque;
import java.util.LinkedList;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+")){
                Integer pop = deque.pop();
                Integer pop1 = deque.pop();
                int i1 = pop + pop1;
                deque.push(i1);
            }else if (token.equals("-")){
                Integer pop = deque.pop();
                Integer pop1 = deque.pop();
                int i1 = pop - pop1;
                deque.push(i1);
            }else if (token.equals("*")){
                Integer pop = deque.pop();
                Integer pop1 = deque.pop();
                int i1 = pop * pop1;
                deque.push(i1);
            }else if (token.equals("/")){
                Integer pop = deque.pop();
                Integer pop1 = deque.pop();
                int i1 = pop / pop1;
                deque.push(i1);
            }else {
                deque.push(Integer.valueOf(token));
            }
        }
        return deque.pop();
    }
}
