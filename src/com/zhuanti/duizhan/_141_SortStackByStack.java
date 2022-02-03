package com.zhuanti.duizhan;


import java.util.Stack;

public class _141_SortStackByStack {
    public void sortStackByStack(Stack<Integer> stack){
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()){
            Integer pop = stack.pop();
            while (!help.isEmpty()&&help.peek()<pop){
                stack.push(help.pop());
            }
            help.push(pop);
        }
        while (!help.isEmpty()){
            stack.push(help.pop());
        }
    }
}
