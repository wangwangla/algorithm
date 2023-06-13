package com.zhuanti.lianbiao;

import com.zhuanti.binaryTree.ListNode;

public class MST0202KthToLast {
    public int kthToLast(ListNode head, int k) {
        ListNode head1 = head;
        ListNode head2 = head;
        for (int i = 0; i < k; i++) {
            head1 = head1.next;
        }
        while (head1!=null){
            head2 = head2.next;
            head1 = head1.next;
        }
        return head1.val;
    }
}
