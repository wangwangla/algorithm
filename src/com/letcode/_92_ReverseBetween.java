package com.letcode;

import com.zhuanti.binaryTree.ListNode;

public class _92_ReverseBetween {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        return null;
    }

//    public void xx(){
        // 设置 dummyNode 是这一类问题的一般做法
//        ListNode dummyNode = new ListNode(-1);
//        dummyNode.next = head;
//        ListNode pre = dummyNode;
//        for (int i = 0; i < left - 1; i++) {
//            pre = pre.next;
//        }
//        ListNode cur = pre.next;
//        ListNode next;
//        for (int i = 0; i < right - left; i++) {
//            next = cur.next;
//            cur.next = next.next;
//            next.next = pre.next;
//            pre.next = next;
//        }
//        return dummyNode.next;
//    }
//    }

    public ListNode test(ListNode head,int left,int right){
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode next;
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummyNode.next;
    }
}
