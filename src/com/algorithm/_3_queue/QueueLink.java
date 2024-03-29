package com.algorithm._3_queue;

import java.util.Iterator;

public class QueueLink<T> implements Iterable<T>{
    private Node head;
    private Node last;
    private int N;

    @Override
    public Iterator<T> iterator() {
        return new MyIter();
    }

    private class MyIter implements Iterator{
        private Node n;

        public MyIter (){
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }

    private class Node{
        public T item;
        public Node next;
        public Node(T item,Node next){
            this.item = item;
            this.next = next;
        }
    }

    public QueueLink(){
        this.head = new Node(null,null);
        this.last = null;
        this.N = 0;
    }

    public boolean idEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public void enqueue(T t){
        if (last == null){
            last = new Node(t,null);
            //修改，这个是带头的
            head.next = last;
        }else {
            Node node = new Node(t,null);
            Node oldLast = last;
            last = node;
            oldLast.next = last;
        }
        N++;
    }

    public T dequeue(){
        if (idEmpty()){
            return null;
        }
        Node oldFrist = head.next;
        head.next = oldFrist.next;
        N--;
        if (idEmpty()){
            last = null;
        }
        return oldFrist.item;
    }

    public static void main(String[] args) {
        QueueLink<Integer> queue = new QueueLink<>();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.printf("输出："+queue.size());
        queue.dequeue();
        System.out.printf("shuch:"+queue.size());
    }
}
