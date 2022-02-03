package com.zhuanti.duizhan;

import java.util.Stack;

public class _121_TwoStackQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public _121_TwoStackQueue(){
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    public void poll(){
        //当为空的时候在 执行导入数据的操作
        if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
//      弹出
    }

    public void push(int push){
        stackPush.push(push);
    }
}
