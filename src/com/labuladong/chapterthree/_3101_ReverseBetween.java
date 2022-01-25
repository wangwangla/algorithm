package com.labuladong.chapterthree;

import com.algorithm.binaryTree.ListNode;

import java.util.List;

/**
 * 反转 链表
 */
public class _3101_ReverseBetween {
    public ListNode reverse(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
