package com.zhuanti;

import com.zhuanti.binaryTree.ListNode;

import java.util.*;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> sortedSet = new ArrayList<>();
        for (ListNode list : lists) {
            while (list!=null) {
                sortedSet.add(list);
            }
        }
        sortedSet.sort(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode head = null;
        ListNode temp = null;
        for (ListNode node : sortedSet) {
            if (head==null){
                head = node;
                temp = node;
            }else {
                temp.next = node;
            }
        }
        return head;
    }
}