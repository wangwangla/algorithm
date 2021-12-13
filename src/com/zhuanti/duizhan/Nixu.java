package com.zhuanti.duizhan;

import java.util.Stack;

public class Nixu {
    public Object test1(Stack stack) {
        Object pop = stack.pop();
        System.out.println(pop);
        if(stack.isEmpty()){
            return pop;
        }
        Object last = test1(stack);
        stack.add(pop);
        return last;
    }

    public void rev(Stack stack){
        if (stack.isEmpty()){
            return;
        }
        Object o = test1(stack);
        rev(stack);
        stack.push(o);
    }
}
