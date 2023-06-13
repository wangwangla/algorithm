package com.zhuanti.lianbiao;

import com.zhuanti.binaryTree.ListNode;

public class MST0203DeleteNode {
//    public void deleteNode(ListNode node) {
//        node.val = node.next.val;
//        node.next = node.next.next;
//    }

    public void deleteNode(ListNode node) {
        while (node.next!=null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.next = null;
    }
}
