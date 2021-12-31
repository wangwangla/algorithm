package com.rowoffer;

import com.algorithm.binaryTree.ListNode;
import com.algorithm.heap.Heap;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 */
public class SortList {
    public ListNode sortList(ListNode head) {
//       节约空间   那就栈排序
        Deque<ListNode> deque = new LinkedList<>();
        Deque<ListNode> deque1 = new LinkedList<>();
        while (head!=null){
//            deque1.add()
        }
        while (head!=null){
            head = head.next;
            while (head.val < deque.peek().val){

            }
            deque.push(head.next);
        }
        return null;
    }

    //归并排序
    public ListNode sortList1(ListNode head) {
        if (head == null || head.next == null)return head;
        ListNode head1 = head;
        ListNode head2 = split(head);
        head1 = sortList1(head1);
        head2 = sortList1(head2);
        merge(head1,head2);
        return null;
    }

    public ListNode split(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid =  slow.next;
        slow.next = null;
        return mid;
    }

    ListNode merge(ListNode head1,ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (head1!=null && head2 !=null){
            if (head1.val<head2.val){
                p = p.next = head1;
                head1 = head1.next;
            }else{
                p = p.next = head2;
                head2 = head2.next;
            }
        }
        if (head1!=null)p.next = head1;
        if (head2!=null)p.next = head2;
        return dummy.next;
    }
}
