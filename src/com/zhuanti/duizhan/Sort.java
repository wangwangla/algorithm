package com.zhuanti.duizhan;

import java.util.Stack;

public class Sort {
    /**
     * 大--->小
     * @param args
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> help = new Stack<>();
        //将数据放入到帮助队列中，如果help中的数据比外面的大，说明反了就需要一次出栈
        while (!stack.isEmpty()){
            int pop = stack.pop();
            if (help.isEmpty()){
                help.add(pop);
            }else {
                while (!help.isEmpty() && help.peek() >= pop){
                    stack.add(help.pop());
                }
                help.add(pop);
            }
        }
    }
}
