package com.zhuanti.lianbiao;

import com.beust.ah.A;
import com.zhuanti.binaryTree.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Offer077SortList {
    public ListNode sortList(ListNode head) {
        ArrayList<ListNode> arrayList = new ArrayList<>();
        while (head != null) {
            arrayList.add(head);
            head = head.next;
        }
        Collections.sort(arrayList, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode newHead = null;
        ListNode tempNode = null;
        for (ListNode node : arrayList) {
            if (newHead == null) {
                newHead = node;
                tempNode = node;
            } else {
                newHead.next = node;
                newHead = newHead.next;
            }
        }
        if (newHead != null) {
            newHead.next = null;
        }

        return tempNode;
    }


    public ListNode sortList1(ListNode head) {

        return null;
    }

}