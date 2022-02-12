package com.zhuanti.linklist;

import com.zhuanti.binaryTree.ListNode;

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode check = check(head);
        if (check!=null){
            ListNode newHead = head;

            while (newHead != check){
                newHead = newHead.next;
                check = check.next;
            }
            return check;
        }else {
            return null;
        }
    }

    public ListNode check(ListNode node){
        ListNode fast = node;
        ListNode slow = node;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return slow;
            }
        }
        return null;
    }

    /**
     *  public ListNode detectCycle(ListNode head) {
     *         ListNode check = check(head);
     *         if (check!=null){
     *             ListNode newHead = head;
     *
     *             while (newHead != check){
     *                 newHead = newHead.next;
     *                 check = check.next;
     *             }
     *             return check;
     *         }else {
     *             return null;
     *         }
     *     }
     *
     *     public ListNode check(ListNode node){
     *         ListNode fast = node;
     *         // ListNode slow = node;
     *         while (fast!=null&&fast.next!=null){
     *             fast = fast.next.next;
     *             node = node.next;
     *             if (fast == node){
     *                 return node;
     *             }
     *         }
     *         return null;
     *     }
     * }
     */
}
