package com.zhuanti.lianbiao;

import com.zhuanti.binaryTree.ListNode;

//3 2 0 -4
public class MST0208 {
    public static void main(String[] args) {
        MST0208 mst0208 = new MST0208();
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        mst0208.detectCycle(node1);
    }
    public ListNode detectCycle(ListNode head) {
        if (head == null)return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                break;
            }
        }
        if (slow == fast){
            //存在环
            fast = head;
            while (fast!=slow){
                fast = fast.next;
                slow = slow.next;
            }
        }else {
            return null;
        }

        return slow;
    }

    public ListNode dd(ListNode head){
        if(head==null||head.next!=null) {
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                break;
            }
        }
        if(fast!=slow)
        {
            return null;
        }
        fast=head;
        while(fast!=slow)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return fast;

    }
}
