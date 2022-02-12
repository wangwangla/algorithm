package com.zhuanti;

import com.zhuanti.binaryTree.ListNode;

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode check = check(head);
        if (check!=null){
            ListNode node = head;
            while (check!=node){
                check = check.next;
                node = node.next;
            }
            return node;
        }
        return null;
    }

    public ListNode check(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return slow;
            }
        }
        return null;
    }
}
