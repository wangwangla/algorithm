package com.algorithm.line.shuangxiang;

public class ShuangxiangLianbiao<T> {
    private Node head;
    public ShuangxiangLianbiao(){
        head = new Node();
        head.pre = null;
        head.next = null;
    }

    private void addNode(T data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node x = head;
        while (x.next != null) {
            x = x.next;
        }
        x.next = node;
        node.pre = x;
        node.next = null;
    }

    private void delete(T data){
        Node node = head;
        while (node.next != null) {
            node = node.next;
            if (node.data == data) {
                break;
            }
        }
        Node pre = node.pre;
        pre.next = pre.next.next;
        Node next = node.next;
        next.pre = pre.pre;
    }

    private void print(){
        Node node = head;
        while (node.next != null) {
            node = node.next;
            System.out.println(node.data);
        }
    }

    class Node<T>{
        private T data;
        private Node next;
        private Node pre;
    }

    public static void main(String[] args) {
        ShuangxiangLianbiao<Integer> shuangxiangLianbiao = new ShuangxiangLianbiao<>();
        shuangxiangLianbiao.addNode(3);
        shuangxiangLianbiao.addNode(4);
        shuangxiangLianbiao.addNode(5);
        shuangxiangLianbiao.addNode(6);
        shuangxiangLianbiao.delete(4);
        shuangxiangLianbiao.print();
    }
}
