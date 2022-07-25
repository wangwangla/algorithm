package com.algorithm._1_line.example;

import com.algorithm._1_line.node.Node;
import com.zhuanti.binaryTree.ListNode;

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

    public Node re(Node node){
        if (node == null)return null;
        Node pre = null;
        Node cur = node.next;

        while (cur != null){
            //先走到下一个
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
        Node re = link.re(node0);
        while (re!=null){
            System.out.println(re.data);
            re = re.next;
        }
    }

    public void re1(Node node){
        if (node == null){
            return;
        }
        Node cur = node;
        Node pre = null;
        while (cur!=null){
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }

    public void rrr(Node node){
        if (node == null){
            return;
        }
        Node cur = node;
        Node pre = null;
        while (cur != null){
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }
}
