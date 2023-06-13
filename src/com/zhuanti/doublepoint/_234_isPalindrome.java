package com.zhuanti.doublepoint;

import com.zhuanti.binaryTree.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _234_isPalindrome {
    public boolean isPalindrome(ListNode head) {
        ArrayList<ListNode> arrayList = new ArrayList();
        while (head != null) {
            arrayList.add(head);
            head = head.next;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).val != arrayList.get(arrayList.size() - 1 - i).val) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        _234_isPalindrome isPalindrome = new _234_isPalindrome();
        System.out.println(isPalindrome.isPalindrome(node1));
    }
}