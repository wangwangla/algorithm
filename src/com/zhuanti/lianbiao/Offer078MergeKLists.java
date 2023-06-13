package com.zhuanti.lianbiao;

import com.zhuanti.binaryTree.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Offer078MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> arrayList = new ArrayList<>();
        for (ListNode list : lists) {
            while (list != null) {
                arrayList.add(list);
                list = list.next;
            }
        }
        ListNode [] arr = new ListNode[arrayList.size()];
        arrayList.toArray(arr);
        Arrays.sort(arr,new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode head = new ListNode();
        ListNode node = head;
        for (ListNode object : arr) {
            object.next = null;
            node.next = object;
        }
        return head.next;
    }
}
