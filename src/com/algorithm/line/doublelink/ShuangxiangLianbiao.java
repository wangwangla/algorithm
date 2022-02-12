package com.algorithm.line.doublelink;

import com.algorithm.line.node.DoubleNode;

public class ShuangxiangLianbiao<T> {
    private DoubleNode head;
    public ShuangxiangLianbiao(){
        head = new DoubleNode();
        head.pre = null;
        head.next = null;
    }

    private void addNode(T data){
        DoubleNode node = new DoubleNode();
        node.data = data;
        DoubleNode x = head;
        while (x.next != null) {
            x = x.next;
        }
        x.next = node;
        node.pre = x;
        node.next = null;
    }

    private void delete(T data){
        DoubleNode node = head;
        while (node.next != null) {
            node = node.next;
            if (node.data == data) {
                break;
            }
        }
        DoubleNode pre = node.pre;
        pre.next = pre.next.next;
        DoubleNode next = node.next;
        next.pre = pre.pre;
    }

    private void print(){
        DoubleNode node = head;
        while (node.next != null) {
            node = node.next;
            System.out.println(node.data);
        }
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
