package com.algorithm._1_line._3_cirlianbiao;

/**
 * 循环链表
 *
 * 循环链表的使用
 * @param <T>
 */
public class XunhuanLianbiao<T> {

    class Node<T>{
        private T no;
        private Node next;
    }

    private Node first = null;

    private void addNode(int num){
        Node node = null;
        for (int i = 0; i < num; i++) {
            Node<Integer> boy = new Node<>();
            boy.no = i;
            if (i == 0){
                first = boy;
                first.next = first;
                node = first;
            }else {
                node.next = boy;
                boy.next = first;
                node = boy;
            }
        }
    }

    public void addNodeDemo(int num){
        Node node = null;
        for (int i = 0; i < num; i++) {
            Node<Integer> newNode = new Node<>();
            newNode.no = i;
            if (i == 0){
                first = newNode;
                first.next = first;
                node = first;
            }else {
                node.next = newNode;
                newNode.next = first;
                node = newNode;
            }
        }
    }


    public void addNodeDemo1(int num){
        Node node = null;
        for (int i = 0; i < num; i++) {
            Node<Integer> newNode = new Node<>();
            newNode.no = i;
            if (i == 0){
                first = newNode;
                node = first;
            }else {
                node.next = newNode;
                node = newNode;
            }
        }
        node.next = first;
    }

    public static void main(String[] args) {
        XunhuanLianbiao<Integer> xunhuanLianbiao = new XunhuanLianbiao<>();
        xunhuanLianbiao.addNodeDemo1(10);
        System.out.println("----------------------");
        xunhuanLianbiao.countBoy(0,3,3);
    }

    public void print(){
        if (first == null){
            return;
        }
        boolean flag = true;
        Node curBoy = first;
        while (flag||curBoy != first){
            System.out.println(curBoy.no);
            flag = false;
            curBoy = curBoy.next;
        }
    }

    public void countBoy(int startNo,int countNum){
        Node t = first;
        t = t.next;

        for (int i = 0; i < startNo-1; i++) {
            t = t.next;
        }
        while (t != t.next){
            for (int i = 0; i < countNum; i++) {
                t = t.next;
            }
            t = t.next;
        }
    }

    public void countBoy(int startNo,int countNum,int nums){
        Node helper = first;
        //为了找到最后一个节点  因为删除需要有前一个节点， 所以需要循环一次 ，找到那个点
        while (helper.next != first){
            helper = helper.next;
        }
        //数数，从那个小朋友开始
        for (int i = 0; i < startNo-1; i++) {
            first = first.next;
            helper = helper.next;
        }
        //真正出队
        while (helper != first){
            for (int i = 0; i < countNum; i++) {
                first = first.next;
                helper = helper.next;
            }
            System.out.println(first.no);
            //头走一步    helper下一个直接跳过
            first = first.next;
            helper.next = first;
        }
    }
}