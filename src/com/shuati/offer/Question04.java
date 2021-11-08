package com.shuati.offer;

import java.util.ArrayList;

/**
 * @author:28188
 * @date: 2021/4/5
 * @time: 8:41
 */
public class Question04 {

     public static class ListNode {
         int val;
         ListNode next;

         ListNode(int x) {
             val = x;
         }
     }

        /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
         *
         * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
         *
         *
         *
         * 示例 1：
         *
         * 输入：head = [1,3,2]
         * 输出：[2,3,1]
     */
    public static int[] reversePrint(ListNode head) {
        if (head==null){
            return new int[0];
        }
        ListNode node;
        node = head;
        ArrayList<Integer> integers = new ArrayList<>();
        while (node!=null) {
            integers.add(node.val);
            node = node.next;
        }

        int index= 0;
        int[] aa = new int[integers.size()];
        for (Integer integer : integers) {
            aa[aa.length - 1-index] = integer;
        }

      return aa;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        reversePrint(node1);
    }
}
