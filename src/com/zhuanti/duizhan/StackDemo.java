package com.zhuanti.duizhan;

/**
 * @author:28188
 * @date: 2021/7/3
 * @time: 18:17
 *
 * 数组实现
 */
public class StackDemo {
    private int maxSize;
    private int arr[];
    private int top = -1;

    public StackDemo(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int num){
        if (isFull()){
            return;
        }
        top ++;
        arr[top] = num;
    }

    public int pop(){
        if (isEmpty()){
            return -1;
        }
        top --;
        return arr[top];
    }
}
