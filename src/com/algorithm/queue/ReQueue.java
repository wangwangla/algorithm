package com.algorithm.queue;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReQueue<T> {
    private T item[];
    private int N;
    private int front;
    private int rear;
    private int maxSize;
    public ReQueue(int num){
        this.maxSize = num;
        this.item = (T[])new Object[num];
//        this.item = Array.newInstance(T,num)
        this.N = 0;
        this.front = -1;
        this.rear = -1;
    }
    //队尾加
    public void enque(T t){
        int index = ++rear % maxSize;
        this.item[index] = t;
    }

    public T outQue(){
        if (isEmpty()) {
            return item[++front%maxSize];
        }
        return null;
    }

    private boolean isFull(){
//        return ((rear - front)+maxSize) == 1;
//        return maxSize - front + maxSize == maxSize;
        return (rear+1)%maxSize == front;
    }

    private boolean isEmpty(){
        return front == rear;
    }

    public static void main(String[] args) {
        ReQueue<Integer> queue = new ReQueue<Integer>(4);
        queue.enque(new Integer(1));
        queue.enque(new Integer(1));
        queue.enque(new Integer(1));
        System.out.println("==============");

    }
}
