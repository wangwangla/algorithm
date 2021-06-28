package com.hanshunping.duilie;

/**
 * @author:28188
 * @date: 2021/6/28
 * @time: 7:59
 */
public class XunhuanDuilie {
    private int maxsize = 10;
    private int front = 0; //tou
    private int rear = 0;  //尾
    private int arr[];
    public XunhuanDuilie(){
        arr = new int[maxsize];
    }

    public boolean isFull(){
        return (rear+1)%maxsize == front;
    }

    public void addData(int num){
        if (isFull())return;
        rear++;
        rear = rear % maxsize;
        arr[rear] = num;
    }

    public int outData(){
        if (isEmpty()){
            return -1;
        }
        front++;
        front%=maxsize;
        return arr[front];
    }

    public boolean isEmpty(){
        if (rear == front)return true;
        return false;
    }
}
