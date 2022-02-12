package com.offer.rowoffer;

import com.zhuanti.binaryTree.ListNode;

import java.util.HashSet;

/**
 * 链表是不是存在环
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode ne = head;
        while (ne!=null){
            if (set.contains(ne)){
                break;
            }
            set.add(ne);
            ne = ne.next;
        }
        return ne;
    }

    /**
     * 环的位置
     * @param node
     * @return
     */
    public ListNode dectectCycle1(ListNode node){
        ListNode fast = node.next.next;
        ListNode slow = node.next;
        while (fast!=slow){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode other = node;
        while (other != slow){
            slow = slow.next;
            other = other.next;
        }
        return slow;
    }



    public ListNode detectCycle3(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
