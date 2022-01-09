package com.zhuanti.linklist;

import com.algorithm.binaryTree.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class SwapPairs  {
    public ListNode swapPairs(ListNode head) {
//        ListNode c = head;
//        ListNode q,o = null;
//        int index = 0;
//        while (c != null){
//            if (index%2 == 0){
//                o = c;
//            }else {
//                q = c;
//                ListNode temp = q;
//                q = o;
//                o = temp;
//                ListNode qN = q.next;
//                q.next = o.next;
//                o.next = qN;
//            }
//            c = c.next;
//        }
//        return head;
//    }
        Deque<ListNode> dequeJ = new LinkedList<>();
        Deque<ListNode> dequeO = new LinkedList<>();

        int index = 0;
        while (head != null) {
            if (index%2 == 0)dequeO.add(head);
            else dequeJ.add(head);
            head = head.next;
        }
        ListNode newNode  = null;
        ListNode newHead = null;
        while (!dequeJ.isEmpty()&&!dequeO.isEmpty()){
            ListNode poll = dequeJ.poll();
            ListNode poll1 = dequeO.poll();
            if (newNode == null){
                newNode = poll;
                newHead = newNode;
                newNode.next = poll1;
            }else {
                newNode.next = poll;
                newNode = poll;
                newNode.next = poll1;
                newNode = poll1;
            }
        }
        if (!dequeJ.isEmpty()){
            newNode.next = dequeJ.poll();
        }
        if (!dequeO.isEmpty()){
            newNode.next = dequeO.poll();
        }
        return newHead;
    }
}
