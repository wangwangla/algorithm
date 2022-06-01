package com.zhuanti.lianbiao;

import com.zhuanti.binaryTree.ListNode;

import java.util.HashSet;

public class MST0201RemoveDuplicateNodes {
    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode newHead = head;
        ListNode temp = head;
        HashSet<Integer> hashSet = new HashSet<>();
        while (temp!=null){
            hashSet.add(temp.val);
        }
        temp = head;
        for (Integer integer : hashSet) {
            temp.val = integer;
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}
