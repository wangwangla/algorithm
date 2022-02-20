package com.zhuanti.linklist;

import com.zhuanti.binaryTree.ListNode;

public class Reverse {
    public void re(ListNode node){
        ListNode temp = node;
        ListNode n = null;
        ListNode newHead = null;
        while (temp!=null){
            n = temp.next;
            ListNode old = newHead;
            newHead = temp;
            temp.next = old;
            temp = n;
        }
        System.out.println("-----------------");
    }

    public void resvere(ListNode head){
        ListNode temp = head;
        ListNode next = null;
        ListNode newHead = null;
        while (temp!=null){
            next = temp.next;

            ListNode old = newHead;
            newHead = temp;
            temp.next = old;

            temp = next;
        }
    }



    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Reverse reverse = new Reverse();
        reverse.re(node1);
    }
}
