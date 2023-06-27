package com.algorithm._2_stack.stack;

import java.util.Iterator;

/**
 * 栈
 * @param <T>
 *
 *   使用前插入的方式
 */
//一定要实现Iterable，一定要加上<T>
public class StackLink<T> implements Iterable<T> {
    //记录结点
    private Node head;
    //栈中的元素
    private int N;

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        private Node n;

        public SIterator(){
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next !=null;
        }

        @Override
        public Object next() {
            n=n.next;
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

    public StackLink(){
        this.head = new Node(null,null);
        this.N = 0;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(T t){
        Node oldNode = head.next;
        Node newNode = new Node(t,null);
        head.next = newNode;
        newNode.next = oldNode;
        N++;
    }

    public void qc(T t){
        Node oldNode = head.next;
        Node newNode = new Node(t,null);
        head.next = newNode;
        newNode.next = oldNode;
        N++;
    }

    public T oo(){
        Node next = head.next;
        if (next != null){
            head = next.next;
            return next.item;
        }
        return null;
    }

    public T pop(){
        Node oldFrist = head.next;
        if (oldFrist == null){
            return null;
        }
        head.next = oldFrist.next;
        N--;
        return oldFrist.item;
    }

    public static void main(String[] args) {
        StackLink<String> stack = new StackLink<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        for (String c : stack) {
            System.out.println("输出："+c);
        }
        System.out.println("剩余size:"+stack.size());
        stack.pop();
        System.out.println("剩余size:"+stack.size());
    }

//    public void play(){
//        forEach(t-> System.out.println(t));
//    }

}
