package com.algorithm._1_line._2_link;

import com.algorithm._1_line.node.Node;

import java.util.Iterator;

public class LianBiao<T> implements Iterable<T> {
    private Node head;
    private int N;

    public LianBiao(){
        head = new Node(null,null);
        this.N = 0;
    }

    public void insertNode(T t){
        Node temp = new Node(t,null);
        Node currentNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = temp;
        N++;
    }

    public void insert(T t,int index){
        Node temp = new Node(t,null);
        Node currentNode = head;
        int i =1 ;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
            i++;
            if (i==index){
                break;
            }
        }
        temp.next = currentNode.next;
        currentNode.next = temp;
    }

    public void edit(T t,int index){
        Node currentNode = head;
        int i =0 ;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
            i++;
            if (i==index){
                break;
            }
        }
        currentNode.data = t;
    }

    public void delete(int index){
        Node currentNode = head;
        int i = 1;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
            i++;
            if (i == index){
                break;
            }
        }
        currentNode.next = currentNode.next.next;
    }

    private  class It<T> implements Iterator<T>{
        private Node current;

        public It(){
            current = head.next;
        }

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public T next() {
            T t = (T)current.data;
            current = current.next;
            return t;
        }
    }

    public static void main(String[] args) {
        LianBiao lianBiao = new LianBiao();
        lianBiao.insertNode(3);
        lianBiao.insertNode(4);
        lianBiao.insertNode(6);
        lianBiao.insert(7,2);
        lianBiao.edit(0,2);
        lianBiao.delete(2);
        Iterator iterator = lianBiao.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new It<T>();
    }

}
