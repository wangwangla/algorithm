package com.zhuanti.duizhan;

import java.util.Stack;

/**
 * 最小堆
 *
 * 最小堆中存储最小堆值
 * 出栈的时候记得吧最小的一起踢出去，不过这个处理重复可能存在问题
 *
 * 处理方法：每个数据都记录一个最小值
 */
public class MinStack {
    public Stack<Integer> stackData;
    public Stack<Integer> stackMin;
    public MinStack(){
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int newNum){
        if (this.stackMin.isEmpty()){
            this.stackMin.add(newNum);
        }else if (newNum < stackMin.peek()){
            stackMin.add(newNum);
        }
        this.stackData.add(newNum);
    }


    public void push1(int newNum){
        if (this.stackMin.isEmpty()){
            this.stackMin.add(newNum);
        }else if (newNum < stackMin.peek()){
            stackMin.add(newNum);
        }else {
            stackMin.add(stackMin.peek());
        }
        this.stackData.add(newNum);
    }


    public int pop(){
        if (this.stackData.isEmpty()){
            throw new RuntimeException();
        }
        int value = this.stackData.pop();
        if (value == this.stackMin.peek()){
            this.stackMin.pop();
        }
        return value;
    }

    public int getMin(){
        if (this.stackMin.isEmpty()){
            throw new RuntimeException();
        }
        return this.stackMin.peek();
    }
}
