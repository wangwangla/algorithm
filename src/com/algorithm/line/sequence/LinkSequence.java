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
        Node x = head;
        while (x.next != null) {
            if (x.next.next == null){
                x.next = null;
                break;
            }
            x = x.next;
        }
    }

    //删除开头
    public void deleteStart(){
        Node x = head;
        if (x.next!=null){
            x.next = x.next.next;
        }
    }

    public void insert(int i,int data){
        if (i<0)return;
        Node x = head;
        int index = 0;
        Node node = new Node();
        node.data = data;
        while (x.next != null) {
            if (index == i){
                break;
            }
            x = x.next;
        }
        if (x!=null){
            Node next = x.next;
            x.next = node;
            node.next = next;
        }
    }

    public void inset(int data){
        Node x = head;
        while (x.next!=null){
            x = x.next;
        }
        Node node = new Node();
        node.data = data;
        x.next = node;
    }

    public static void main(String[] args) {
        LinkSequence sequence = new LinkSequence();
        sequence.addData(1);
        sequence.addData(3);
        sequence.addData(4);
        sequence.inset(5);
//        sequence.insert(0,1);
//        sequence.deleteRear();
//        sequence.deleteStart();
        sequence.print();
    }

}
