package com.zhuanti.stack;

import java.util.Deque;
import java.util.Stack;

public class MyQueue {
    Stack<Integer> stackIn = new Stack<>();
    Stack<Integer> stackOut = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        if (stackOut.isEmpty()){
            in2out();
        }
        return stackOut.pop();
    }

    public int peek() {
        if (stackOut.isEmpty()){
            in2out();
        }
        return stackOut.peek();
    }

    public boolean empty() {
        if (stackIn.isEmpty() && stackOut.isEmpty()){
            return true;
        }
        return false;
    }

    private void in2out() {
        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }
    }
}
