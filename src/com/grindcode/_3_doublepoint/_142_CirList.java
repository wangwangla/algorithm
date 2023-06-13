package com.grindcode._3_doublepoint;

import java.util.List;

/**
 * 环
 *
 * 快慢指针， 一个走快，一个慢
 *
 *
 * 相遇的时候就说明有环
 */
public class _142_CirList {
    class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }
    public ListNode detectCycle(ListNode node){
        ListNode slow = node;
        ListNode fast = node;
        while (true){
            if (fast ==null || fast.next==null){
                return null;
            }
            if (slow==fast){
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = node;
        while (fast!=slow){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
