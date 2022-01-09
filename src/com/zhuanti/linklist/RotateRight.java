package com.zhuanti.linklist;

import com.algorithm.binaryTree.ListNode;

public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (k>0&&fast!=null){
            fast = fast.next;
        }
        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = head;
        slow.next = null;
        return fast;
    }

    public ListNode rotateRight1(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        int num = 0;
        while (fast!=null){
            fast = fast.next;
            num++;
        }
        fast = head;
        int i = k % num;
        while (i>0){
            fast = fast.next;
            i--;
        }

        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        slow.next = null;
        return fast;
    }


}
