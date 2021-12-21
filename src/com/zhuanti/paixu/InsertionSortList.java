package com.zhuanti.paixu;

public class InsertionSortList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode insertionSortList(ListNode head) {
        if(head == null)return null;
        ListNode temp = head;
        while (temp!=null){
            temp = temp.next;

        }


        return null;
    }
}
