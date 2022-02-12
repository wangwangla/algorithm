package com.zhuanti.linklist;

import com.zhuanti.binaryTree.ListNode;

import java.util.HashMap;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if (head==null||head.next == null) {
            return head;
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        while (temp!=null){
            hashMap.put(temp.val,hashMap.getOrDefault(temp.val,0)+1);
            temp = temp.next;
        }
        temp = head;
        ListNode node = new ListNode(-1);
        while (temp!=null){
            Integer integer = hashMap.get(temp.val);
            if (integer == 1){
                node.next = temp;
            }
            temp = temp.next;
        }
        return node.next;
    }

    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0, head);

        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}
