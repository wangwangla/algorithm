package com.zhuanti.duizhan;

import java.util.Stack;

public class DouBleStackToQueue {
    public Stack<Integer> stack;
    public Stack<Integer> stack2;

    public void en(int a){
        if (!stack2.isEmpty()) {
            stack.clear();
            while (!stack2.isEmpty()) {
                stack.add(stack2.pop());
            }
        }
        stack.add(a);
    }


    public void qu(){
        if (!stack.isEmpty()) {
            while (!stack.isEmpty()){
                stack2.add(stack.pop());
            }
        }
    }
}
