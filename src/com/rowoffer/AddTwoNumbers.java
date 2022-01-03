package com.rowoffer;

import com.algorithm.binaryTree.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<ListNode> deque1 = new LinkedList();
        Deque<ListNode> deque2 = new LinkedList();
        while (l1 != null) {
            deque1.push(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            deque2.push(l2);
            l2 = l2.next;
        }

        int res = 0;
        int ccc = 0;
        ListNode newNode = new ListNode(-1);
        while (!deque1.isEmpty() && !deque2.isEmpty()){
            ListNode pop = deque1.pop();
            ListNode pop1 = deque2.pop();
            int i = pop.val + pop1.val + ccc;
            ccc = 0;
            res = i % 10;
            ccc = i / 10;
//            dd.push();
            ListNode listNode = new ListNode(res);
            listNode.next = newNode.next;
            newNode.next = listNode;
        }

        while (!deque1.isEmpty()){
            ListNode pop = deque1.pop();
            int i = pop.val + ccc;
            ccc = 0;
            res = i % 10;
            ccc = i / 10;
//            dd.push(new ListNode(res));

            ListNode listNode = new ListNode(res);
            listNode.next = newNode.next;
            newNode.next = listNode;
        }
        while (!deque2.isEmpty()){
            ListNode pop1 = deque2.pop();
            int i =  pop1.val + ccc;
            ccc = 0;
            res = i % 10;
            ccc = i / 10;
//            dd.push(new ListNode(res));

            ListNode listNode = new ListNode(res);
            listNode.next = newNode.next;
            newNode.next = listNode;
        }

        if (ccc != 0){
            ListNode listNode = new ListNode(ccc);
            listNode.next = newNode.next;
            newNode.next = listNode;
        }
        return newNode.next;
    }
}
