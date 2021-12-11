package com.zhuanti.duizhan;

import java.util.Stack;

public class NiXuStack {
    public Stack<Integer> stack;
    public NiXuStack(){
        stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.add(i);
        }
    }

    public int test(){
        Integer pop = stack.pop();
        if (stack.isEmpty()){
            return pop;
        }else {

        }
        test();
        System.out.println(pop);
        stack.add(pop);
        return pop;
    }

    public void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        test();
    }

    public static void main(String[] args) {
        NiXuStack stack = new NiXuStack();
        stack.test();
        System.out.println("xxxxxxxxxxxxxxxxxx");
    }
}
