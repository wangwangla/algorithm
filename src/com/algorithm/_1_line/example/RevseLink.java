package com.algorithm._1_line.example;

import com.algorithm._1_line.node.Node;
import com.zhuanti.binaryTree.ListNode;

import java.util.Stack;

public class RevseLink {
    public Node reverseList(Node head) {
        if(head == null){return null;}
        // 相当于设置头节点， 不需要考虑处理特殊情况(第一二个节点)
        Node pre = null;
        Node cur = head;

        while(cur != null){
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
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

        RevseLink link = new RevseLink();
        link.test1(node0);
//        while (re!=null){
//            System.out.println(re.data);
//            re = re.next;
//        }
    }

    public void test(Node node){
        Stack<Node> stack = new Stack();
        while (node!=null) {
            stack.add(node);
            node = node.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop().data);
        }
//        for (Node o : stack) {
//            System.out.println(o.data);
//        }
    }


    public void test1(Node node){
        if (node==null)return;
        test1(node.next);
        System.out.println(node.data);

    }
}
