package com.zhuanti.linklist;

import com.zhuanti.binaryTree.ListNode;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> arrayList = new ArrayList<>();
        for (ListNode list : lists) {
            ListNode hh = list;
            while (hh!=null) {
                arrayList.add(hh);
                hh = hh.next;
            }
        }
        arrayList.sort(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode newHead = null;
        ListNode nn = null;
        for (ListNode listNode : arrayList) {
            if (nn == null){
                nn = listNode;
                newHead = nn;
            }else {
                nn.next = listNode;
            }
        }
        return newHead;
    }
}
