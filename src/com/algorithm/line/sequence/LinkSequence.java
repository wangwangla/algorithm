package com.algorithm.line.sequence;

public class LinkSequence {
    private Node<Integer> head;
    public LinkSequence(){
        head = new Node<>();
    }

    /**
     * 头节点没有数据，从第二个节点开始加入
     * 存储但是需要知道上一个节点
     *
     * @param num
     */
    private void addData(int num){
        Node<Integer> node = new Node<>();
        node.data = num;
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    class Node<T>{
        private int data;
        private Node next;
    }

    private void print(){
        Node x = head;
        while (x.next!=null){
            System.out.println(x.next.data);
            x = x.next;
        }
    }

    //删除末尾
    public void deleteRear(){

    }

    //删除开头
    public void deleteStart(){

    }

    public void insert(int i,int data){

    }

    public void inset(int data){

    }

    public void insertHead(int data){

    }
    public static void main(String[] args) {
        LinkSequence sequence = new LinkSequence();
        sequence.addData(1);
        sequence.addData(3);
        sequence.addData(4);
        sequence.print();
    }

}
