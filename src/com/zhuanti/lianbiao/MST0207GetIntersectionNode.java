package com.zhuanti.lianbiao;

import com.zhuanti.binaryTree.ListNode;

public class MST0207GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null||headB == null){
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pB;
    }
}