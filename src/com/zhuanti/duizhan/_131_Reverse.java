package com.zhuanti.duizhan;

import java.util.Stack;

public class _131_Reverse {
    public void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    private int getAndRemoveLastElement(Stack<Integer> stack) {
        Integer pop = stack.pop();
        if (stack.isEmpty()){
            return pop;
        }else {
            int andRemoveLastElement = getAndRemoveLastElement(stack);
            stack.push(pop);
            return andRemoveLastElement;
        }
    }
}
