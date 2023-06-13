package com.algorithm._1_line.example;

import com.algorithm._1_line.node.Node;

public class NodeNum {
    public int nodeNum(Node node){
        int num = 0;
        while (node!=null){
            num++;
            node = node.next;
        }
        return num;
    }


    public static void main(String[] args) {
        Node node0 = new Node(-1);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        NodeNum  nodeNum = new NodeNum();
        System.out.println(nodeNum.nodeNum(node0));
    }
}
