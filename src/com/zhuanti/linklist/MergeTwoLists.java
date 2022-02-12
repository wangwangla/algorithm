package com.zhuanti.linklist;

import com.zhuanti.binaryTree.ListNode;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp = null;
        ListNode newNode = null;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                temp = list1.val < list2.val ? list1 : list2;

                if (head == null) {
                    head = temp;
                    newNode = head;

                } else {
                    head.next = temp;
                    head = temp;
                }
                if (temp == list1) {
                    list1 = list1.next;
                } else {
                    list2 = list2.next;
                }
            } else {
                if (list1 == null) {
                    if (head == null) {
                        head = list2;
                        newNode = head;
                    } else {
                        head.next = list2;
                    }
                } else {
                    if (head == null) {
                        head = list1;
                        newNode = head;
                    } else {
                        head.next = list1;
                    }
                }
                break;
            }
        }
        return newNode;

    }
}
