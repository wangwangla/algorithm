package com.zhuanti.lianbiao;

public class NiXu {
    public static void main(String[] args) {

    }

    public void rev(ListNode head){
        ListNode curr = head;
        ListNode pre = null;
        ListNode next = null;
        while (curr!=null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
    }

    class ListNode{
        ListNode next;
        int data;
    }
}
