package com.hanshunping.lianbiao;

/**
 * @author:28188
 * @date: 2021/6/30
 * @time: 22:02
 */
public class LianBiao {
    static class Node<T>{
        public T data;
        public Node<T> next;
        public Node(T data){
            this.data = data;
            next = null;
        }
    }


    private Node head;
    public void addNode(int num){
        if (this.head != null) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node node = new Node(num);
            temp.next = node;
        }else {
            this.head = new Node(num);
        }
    }


    public static void main(String[] args) {
        LianBiao biao = new LianBiao();
        biao.addNode(0);
        biao.addNode(1);
        biao.addNode(2);
        biao.addNode(3);
        biao.addNode(4);
        biao.addNode(5);
        biao.addNode(6);
        System.out.println("===============================");




        //        Node node1 = new Node<Integer>(1);
//        Node node2 = new Node<Integer>(2);
//        Node node3 = new Node<Integer>(3);
//        Node node4 = new Node<Integer>(4);
//        Node node5 = new Node<Integer>(5);
//        Node node6 = new Node<Integer>(6);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;

        System.out.println("=======================");
    }
}
