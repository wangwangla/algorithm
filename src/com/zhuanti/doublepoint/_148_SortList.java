package com.zhuanti.doublepoint;

import com.zhuanti.binaryTree.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _148_SortList {
    public ListNode sortList(ListNode head) {
        ArrayList<ListNode> arrayList = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            arrayList.add(temp);
            temp = temp.next;
        }
        Collections.sort(arrayList, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode newHead = new ListNode();
        ListNode node = newHead;
        for (ListNode listNode : arrayList) {
            node.next = listNode;
            node = listNode;
            listNode.next = null;
        }
        return newHead;
    }
}
