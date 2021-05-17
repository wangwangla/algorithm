package com.letcode;

import java.awt.*;

/**
 * @author:28188
 * @date: 2021/5/16
 * @time: 14:34
 */
public class Question38 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        node1.next = node3;
        node2.next = node4;
        node3.next = node5;
        node4.next = node6;
        mergeTwoLists(node1,node2);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode head = node;
        while (l1!=null&&l2!=null){
            if (l1.val>l2.val){
                ListNode node1 = l2;
                l2 = l2.next;
                node.next = node1;
                node = node.next;
                node.next = null;
            }else {
                ListNode node1 = l1;
                l1 = l1.next;
                node.next = node1;
                node = node.next;

                node.next = null;
            }
        }
        if (l1!=null){
            node.next = l1;
        }
        if (l2!=null){
            node.next = l2;
        }
        return head.next;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */