package com.zhuanti.array;

import com.zhuanti.binaryTree.ListNode;

import java.util.List;

public class _328_oddEvenList {
    public ListNode oddEvenList(ListNode head) {
        ListNode jiNode = null;
        ListNode jicur = null;
        ListNode ouNode = null;
        ListNode ouCur = null;
        int index = 0;
        while (head != null) {
            ListNode temp = head.next;
            if (index % 2 == 0) {
                if (jiNode == null) {
                    jiNode = head;
                    jicur = jiNode;
                    jicur.next = null;
                } else {
                    jiNode.next = head;
                    jiNode = jiNode.next;
                    jiNode.next = null;
                }
            }else {
                if (ouNode == null) {
                    ouNode = head;
                    ouCur = ouNode;
                    ouCur.next = null;
                } else {
                    ouNode.next = head;
                    ouNode = ouNode.next;
                    ouNode.next = null;
                }
            }
            index++;
            head = temp;
        }
        if(jiNode!=null){
            jiNode.next = ouCur;
        }
        return jicur;
    }

    public void chai(ListNode node){
        ListNode head = node;
        while (head.next != null) {
            head = head.next;
        }
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        _328_oddEvenList oddEvenLis = new _328_oddEvenList();
        oddEvenLis.oddEvenList1(node1);
    }

    public ListNode oddEvenList1(ListNode head) {
        ListNode jiNode = null;
        ListNode jicur = null;
        ListNode ouNode = null;
        ListNode ouCur = null;


        int index = 0;

        while (head != null) {
            ListNode temp = head.next;
            if (index % 2 == 0) {
                if (jiNode == null) {
                    jiNode = head;
                    jicur = jiNode;
                } else {
                    jiNode.next = head;
                    jiNode = jiNode.next;
                    jiNode.next = null;
                }
            }else {
                if (ouNode == null) {
                    ouNode = head;
                    ouCur = ouNode;
                } else {
                    ouNode.next = head;
                    ouNode = ouNode.next;
                    ouNode.next = null;
                }
            }
            index++;
            head = temp;
        }

        jiNode.next = ouCur;
        System.out.println("------------------");
        return jicur;
    }
}
