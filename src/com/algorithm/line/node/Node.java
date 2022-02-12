package com.algorithm.line.node;

public class Node<T> {
    public T data;
    public Node next;

    public Node(){

    }

    public Node(T t){
        this.data = t;
        this.next = null;
    }

    public Node(T t,Node node){
        this.data = t;
        this.next = node;
    }
}
