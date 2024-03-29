package com.algorithm._3_queue;

/**
 * 单队列（非循环）
 * @param <T>
 */
public class QueueArray<T> {

    private T item[];

    private int N;

    private int front;

    private int rear;

    private int maxSize;

    public QueueArray(int num){
        this.maxSize = num;
        this.item = (T[])new Object[num];
        this.N = 0;
        this.front = -1;
        this.rear = -1;
    }
    //队尾加
    public void enque(T t){
        if (isFull())return;
        this.item[++rear] = t;
        N++;
    }

    public T outQue(){
        if (!isEmpty()) {
            N--;
            return item[++front];
        }
        return null;
    }

    private boolean isFull(){
        return maxSize == rear - 1;
    }

    private boolean isEmpty(){
        return front == rear;
    }

    public int getSize(){
        return N;
    }
}
