package com.rowoffer;

import com.algorithm.binaryTree.ListNode;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if (set.contains(headB)) {
                break;
            }
            headB = headB.next;
        }
        return headB;
    }


    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        Deque<ListNode> deque1 = new LinkedList<>();
        Deque<ListNode> deque2 = new LinkedList<>();
        while (headA != null) {
            deque1.push(headA);
            headA = headA.next;
        }
        while (headB != null){
            deque2.push(headB);
            headB = headB.next;
        }
        ListNode ss = null;
        while (!deque1.isEmpty() && !deque2.isEmpty()) {
            ListNode p1 = deque1.pop();
            ListNode p2 = deque2.pop();
            if (p1.val != p2.val){
               break;
            }
            ss = p1;
        }

        return ss;
    }

}
