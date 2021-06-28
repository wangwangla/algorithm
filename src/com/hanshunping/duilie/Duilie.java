package com.hanshunping.duilie;

/**
 * @author:28188
 * @date: 2021/6/27
 * @time: 22:07
 */
public class Duilie {
    private int maxsize = 10;
    private int front = -1; //tou
    private int rear = -1;  //尾
    private int arr[];
    public Duilie(){
        arr = new int[maxsize];
    }

    public boolean isFull(){
        return rear == maxsize - 1;
    }

    public void addData(int num){
        if (isFull())return;
        rear++;
        arr[rear] = num;
    }

    public int outData(){
        if (isEmpty()){
            return -1;
        }
        front++;
        return arr[front];
    }

    public boolean isEmpty(){
        if (rear == front)return true;
        return false;
    }
}
