package com.zhuanti.linklist;

import com.zhuanti.binaryTree.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        Deque<ListNode> dequeJ = new LinkedList<>();
        Deque<ListNode> dequeO = new LinkedList<>();
        int index = 0;
        while (head != null) {
            index ++;
            if (index%k == 0)dequeO.add(head);
            else dequeJ.add(head);
            head = head.next;
        }
        ListNode newNode  = null;
        ListNode newHead = null;
//        while ()
        while (!dequeJ.isEmpty()&&!dequeO.isEmpty()){
            ListNode poll = dequeJ.poll();
            poll.next = null;
            ListNode poll1 = dequeO.poll();
            poll1.next = null;
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
