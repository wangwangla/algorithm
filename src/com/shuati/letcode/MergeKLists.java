package com.shuati.letcode;

/**
 * @author:28188
 * @date: 2021/5/16
 * @time: 15:14
 *
 */

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode mergeKLists(ListNode[] lists) {
//
//    }
//
    /*、
    * 一种说出来都会被打的方法。
    *
    * 将数据拿出来进行排序，然后在创建陈数组
    *
    * */
public class MergeKLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (ListNode list : lists) {
            while (list!=null){
                list1.add(list.val);
                list = list.next;
            }
        }
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == o2)return 0;
                if (o1>o2){
                    return 1;
                }else {
                    return -1;
                }
            }
        });

        ListNode head = null;
        ListNode node = null;
        for (Integer integer : list1) {
            ListNode node1 = new ListNode(integer);
            if (node == null){
                node = node1;
                head = node1;
            }else {
                node.next = node1;
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(5);
        node11.next = node12;
        node12.next = node13;

        ListNode node21 = new ListNode(1);
        ListNode node22 = new ListNode(3);
        ListNode node23 = new ListNode(4);
        node21.next = node22;
        node22.next = node23;

        ListNode node31 = new ListNode(2);
        ListNode node32 = new ListNode(6);
        node31.next = node32;

        ListNode nodes[] = new ListNode[3];
        nodes[0] = node11;
        nodes[1] = node21;
        nodes[2] = node31;
        mergeKLists(nodes);

    }
}
