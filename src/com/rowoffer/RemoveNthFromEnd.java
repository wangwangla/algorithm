package com.rowoffer;

import com.algorithm.binaryTree.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 是不是需要头
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = new ListNode(0, head);
        ListNode newHead = slow;
        ListNode fast = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
//        removeNthFromEnd.removeNthFromEnd2(new ListNode(1),1);
    }


    public ListNode removeNthFromEnd1(ListNode head, int n) {
        Deque<ListNode> deque = new LinkedList<>();
        ListNode newHead = new ListNode(0,head);
        ListNode hhh = newHead;
        while (hhh!=null){
            deque.push(hhh);
            hhh = hhh.next;

        }
        for (int i = 0; i < n; i++) {
            deque.pop();
        }
        ListNode peek = deque.peek();
        peek.next = peek.next.next;
        return newHead.next;
    }
}