package com.rowoffer;

import com.algorithm.binaryTree.ListNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<ListNode> deque1 = new LinkedList();
        Deque<ListNode> deque2 = new LinkedList();
        while (l1 != null) {
            deque1.add(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            deque2.add(l2);
            l2 = l2.next;
        }

        int res = 0;
        int ccc = 0;
        ListNode newNode = new ListNode(-1);
        ListNode nn = newNode;
        while (!deque1.isEmpty() && !deque2.isEmpty()){
            ListNode pop = deque1.poll();
            ListNode pop1 = deque2.poll();
            int i = pop.val + pop1.val + ccc;
            ccc = 0;
            res = i % 10;
            ccc = i / 10;
//            dd.push();
            ListNode listNode = new ListNode(res);
//            listNode.next = newNode.next;
            newNode.next = listNode;
            newNode = listNode;
        }

        while (!deque1.isEmpty()){
            ListNode pop = deque1.poll();
            int i = pop.val + ccc;
            ccc = 0;
            res = i % 10;
            ccc = i / 10;
//            dd.push(new ListNode(res));

            ListNode listNode = new ListNode(res);
//            listNode.next = newNode.next;
            newNode.next = listNode;
            newNode= listNode;
        }
        while (!deque2.isEmpty()){
            ListNode pop1 = deque2.poll();
            int i =  pop1.val + ccc;
            ccc = 0;
            res = i % 10;
            ccc = i / 10;
//            dd.push(new ListNode(res));

            ListNode listNode = new ListNode(res);
//            listNode.next = newNode.next;
            newNode.next = listNode;
            newNode = listNode;
        }

        if (ccc != 0){
            ListNode listNode = new ListNode(ccc);
//            listNode.next = newNode.next;
            newNode.next = listNode;
            newNode = listNode;
        }
        return nn.next;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        Deque<ListNode> deque1 = new LinkedList();
        Deque<ListNode> deque2 = new LinkedList();
        while (l1 != null) {
            deque1.add(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            deque2.add(l2);
            l2 = l2.next;
        }

        int res = 0;
        int ccc = 0;
        ListNode newNode = new ListNode(-1);
        ListNode nn = newNode;
        while (!deque1.isEmpty() || !deque2.isEmpty()){
            ListNode pop = deque1.isEmpty() ?new ListNode(0):deque1.poll();
            ListNode pop1 = deque2.isEmpty() ?new ListNode(0):deque2.poll();
            int i = pop.val + pop1.val + ccc;
            res = i % 10;
            ccc = i / 10;
//            dd.push();
            ListNode listNode = new ListNode(res);
//            listNode.next = newNode.next;
            newNode.next = listNode;
            newNode = listNode;
        }

        if (ccc != 0){
            ListNode listNode = new ListNode(ccc);
//            listNode.next = newNode.next;
            newNode.next = listNode;
            newNode = listNode;
        }
        return nn.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int res = 0;
        int ccc = 0;
        ListNode newNode = new ListNode(-1);
        ListNode nn = newNode;
        while (l1!=null || l2!=null){
            ListNode pop = l1==null ?new ListNode(0):l1;
            ListNode pop1 = l2 == null ?new ListNode(0):l2;
            int i = pop.val + pop1.val + ccc;
            res = i % 10;
            ccc = i / 10;
            ListNode listNode = new ListNode(res);
            newNode.next = listNode;
            newNode = listNode;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (ccc != 0){
            ListNode listNode = new ListNode(ccc);
            newNode.next = listNode;
        }
        return nn.next;
    }

}
