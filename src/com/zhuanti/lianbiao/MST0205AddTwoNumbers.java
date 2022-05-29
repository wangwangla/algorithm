package com.zhuanti.lianbiao;

import com.zhuanti.binaryTree.ListNode;

public class MST0205AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode head = new ListNode();
        ListNode node = new ListNode();
        while (l1!=null || l2!=null){
            int num1 = l1 == null ? 0:l1.val;
            int num2 = l2 == null ? 0:l2.val;
            int i = (num1 + num2 + c)%10;
            c = (num1 + num2 + c)/10;
            ListNode node1 = new ListNode(i);
            node.next = node1;
            node = node1;
        }
        if (c!=0){
            node.next = new ListNode(c);
        }
        return head;
    }
}
