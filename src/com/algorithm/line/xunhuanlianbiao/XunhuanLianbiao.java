package com.algorithm.line.xunhuanlianbiao;

public class XunhuanLianbiao<T> {
    class Node<T>{
        private T no;
        private Node next;
    }

    private Node first = null;
    private void addNode(int num){
        Node node = null;
        for (int i = 1; i < num; i++) {
            Node<Integer> boy = new Node<>();
            if (i == 1){
                first = node;
                first.next = first;
                node = first;
            }else {
                node.next = boy;
                boy.next = first;
                node = boy;
            }
        }
    }

    public void print(){
        if (first == null){
            return;
        }
        Node curBoy = first;
        while (curBoy != first){
            System.out.println(curBoy.no);
            curBoy = curBoy.next;
        }
    }

    public void countBoy(int startNo,int countNum,int nums){
        Node helper = first;
        //为了找打最后一个节点
        while (helper.next != first){
            helper = helper.next;
        }
        //数数，从那个小朋友开始
        for (int i = 0; i < startNo-1; i++) {
            first = first.next;
            helper = helper.next;
        }
        //真正的叔叔出队
        while (helper == first){
            for (int i = 0; i < countNum; i++) {
                first = first.next;
                helper = helper.next;
            }
            first = first.next;
            helper.next = first;
        }
    }
}
