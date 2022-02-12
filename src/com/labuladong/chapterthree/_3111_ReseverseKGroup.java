package com.labuladong.chapterthree;

import com.zhuanti.binaryTree.ListNode;

public class _3111_ReseverseKGroup {
    public ListNode rev(ListNode head){
        ListNode pre = null;
        ListNode nex = null;

        while (head!=null){
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
        }
        return pre;
    }

    public ListNode rev1(ListNode head){
        ListNode nex = null;
        ListNode pre = null;
        while (head!=null){
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
        }
        return pre;
    }

    public ListNode kGroupPev1(ListNode start, ListNode end){
        ListNode pre,cur,nxt;
        pre = null;
        cur = start;
        nxt = start;
        while (cur!=end){
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }

    public ListNode kGroupPev2(ListNode head, int k){
        if (head == null)return null;
        ListNode a,b;
        a = b = head;
        for (int i = 0; i < k; i++) {
            if (b == null) return head;
            b = b.next;
        }
        ListNode newHead = kGroupPev1(a,b);
        a.next = kGroupPev2(b,k);
        return newHead;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        _3111_ReseverseKGroup reseverseKGroup = new _3111_ReseverseKGroup();
        reseverseKGroup.rev(node1);
        System.out.println("--------------------------");
    }

}
