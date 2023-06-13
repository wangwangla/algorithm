package com.algorithm._1_line.example;

import com.algorithm._1_line.node.Node;

/**
 * 合并两个有序数组
 */
public class HebingLink {
    public Node hebing(Node<Integer> node1,Node<Integer> node2){
        Node<Integer> head = new Node();
        Node<Integer> temp = head;
        while (node1!=null || node2 != null){
            if (node1 == null) {
                temp.next = node2;
                break;
            }
            if (node2 == null){
                temp.next = node1;
                break;
            }
            if (node1.data>node2.data) {
                temp.next = node2;
                node2 = node2.next;
            }else {
                temp.next = node1;
                node1 = node1.next;
            }
            temp = temp.next;
            temp.next = null;
        }
        return temp;
    }

    public Node<Integer> hebing1(Node<Integer> node1, Node<Integer> node2){
        Node<Integer> head = new Node<>();
        Node<Integer> temp = head;
        while (node1!=null || node2!=null){
            if (node1==null){
                temp.next = node2;
                break;
            }
            if (node2 == null){
                temp.next= node1;
                break;
            }
            temp.next = node1.data > node2.data ? node2 : node1;
            temp = temp.next;
            temp.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node(1);
        Node<Integer> node4 = new Node(4);
        Node<Integer> node5 = new Node(5);
        Node<Integer> node8 = new Node(8);

        node1.next = node4;
        node4.next = node5;
        node5.next = node8;

        Node<Integer> node2 = new Node(2);
        Node<Integer> node3 = new Node(3);
        Node<Integer> node6 = new Node(6);
        Node<Integer> node7 = new Node(7);

        node2.next = node3;
        node3.next = node6;
        node6.next = node7;

        HebingLink link = new HebingLink();
        link.hebing(node1,node2);

    }
}
