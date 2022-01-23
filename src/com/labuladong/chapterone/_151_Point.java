package com.labuladong.chapterone;

import com.algorithm.binaryTree.ListNode;

public class _151_Point {
    /**
     * 快慢指针找出环
     * @param node
     * @return
     */
    boolean hasCycle(ListNode node){
        ListNode slowNode = node;
        ListNode fastNode = node;
        while (fastNode!=null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (fastNode == slowNode)return true;
        }
        return false;
    }

    public ListNode detactCycle(ListNode head){
        ListNode  fast = head;
        ListNode slow = head;
        while (fast!=null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //找中点  分为奇数和偶数
    public ListNode mid(ListNode head){
        if (head==null)return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return null;
    }

}
