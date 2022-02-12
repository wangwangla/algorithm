package com.algorithm.line.demo;

import com.algorithm.line.node.Node;

public class LinkDemo {

    private Node head;

    public int num(){
        Node temp = head;
        int num = 0;
        while (temp!=null) {
            num ++;
            temp = temp.next;
        }
        return num;
    }

    /**
     * 快慢指针
     * @param i
     */
    public void findLastIndexData(int i){
//        找出第i个节点
        Node temp = head;
        int xx = 0;
        Node man = head;
        while (temp != null){
            temp = temp.next;
            xx ++;
            if (xx >= i){
                man = man.next;
            }
        }
        System.out.println(man.data);
    }

    public void xuanzhuan(){
        //前插法
//        Node t = head;
//        Node temp = head;
//        if (t.next!=null) {
//            temp = t.next.next;
//        }
//        while (temp!=null){
//            Node next = head.next;
//            head.next = temp;
//            next.next = temp.next;
//        }
        Node t = head;
        while (t!=null){
            Node te = t.next;
            t.next = head;
            head = t;
            t = te;
        }
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        LinkDemo demo = new LinkDemo();
        demo.head = node1;
        demo.xuanzhuan();
        System.out.println("====");

    }
}
