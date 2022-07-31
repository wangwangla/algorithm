package com.zhuanti.doublepoint;

import com.zhuanti.binaryTree.ListNode;

import java.util.ArrayList;
import java.util.List;

public class _143_ReorderList {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        List<ListNode> list = new ArrayList<ListNode>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }

        int start = 0;
        int end =  list.size() - 1;
        while (start < end){
            ListNode node1 = list.get(start);
            node1.next = list.get(end);
            start++;
            list.get(start).next = null;
            if (start == end){
                break;
            }
            list.get(end).next = list.get(start);
            end --;
            list.get(end).next = null;
        }
    }
}
