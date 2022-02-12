package com.labuladong.chapterthree;

import com.zhuanti.binaryTree.ListNode;

/**
 * 反转 链表
 */
public class _3101_ReverseBetween {
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    public ListNode res(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = res(head);
        head.next.next = head;
        head.next = null;
        return last;
    }


    /**
     * 反转前n个
     */
    ListNode xx = null;

    public ListNode ddd(ListNode head, int n) {
        if (n == 1) {
            xx = head.next;
            return head;
        }
        ListNode last = res(head);
        head.next.next = head;
        head.next = xx;
        return last;
    }

    public ListNode ss(ListNode head, int m, int n) {
        if (m == 1) {
            return ddd(head, n);
        }
        /**
         * 一直减去m，
         */
        head.next = ss(head.next, m - 1, n - 1);
        return head;
    }


    public void reverse1(ListNode node){
        ListNode node1 = new ListNode(0);
        while (node != null) {
            ListNode node2 = node;
            node = node.next;
            node2.next =  node1.next;;
            node1.next = node2;
        }
        System.out.println(node1);
    }

    private ListNode head = new ListNode(0);
    private ListNode head1 = head;

    public void reverse2(ListNode node){
        if (node==null)return;
        reverse2(node.next);
        head.next = node;
        head = head.next;
        System.out.println(node.val);
    }

    public void reverseK(ListNode node,int k){
        if (k == 1){
            return;
        }
        if (node==null)return;
        reverse2(node.next);
        head.next = node;
        head = head.next;
        System.out.println(node.val);
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        _3101_ReverseBetween between = new _3101_ReverseBetween();
        between.reverse2(node1);
        System.out.println("-------------------------");
    }
}
