package com.grindcode._13_Link;

import com.zhuanti.binaryTree.ListNode;

public class _13_Link {

    ListNode reverseList(ListNode head) {
        ListNode prev = null, next;
        while (head!=null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
