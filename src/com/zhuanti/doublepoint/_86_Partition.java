package com.zhuanti.doublepoint;

import com.zhuanti.binaryTree.ListNode;

import java.util.ArrayList;

/**
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 *
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,4,3,2,5,2], x = 3
 * 输出：[1,2,2,4,3,5]
 * 示例 2：
 *
 * 输入：head = [2,1], x = 2
 * 输出：[1,2]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/partition-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _86_Partition {
    public ListNode partition(ListNode head, int x) {
        ArrayList<ListNode> arrayList = new ArrayList<>();
        ArrayList<ListNode> arrayList1 = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            if (temp.val>=  x){
                arrayList.add(temp);
            }else {
                arrayList1.add(temp);
            }
            temp = temp.next;
        }
        ListNode newhead = new ListNode();
        ListNode newTemp = newhead;
        for (ListNode node : arrayList1) {
            newTemp.next = node;
            node.next = null;
            newTemp = node;
        }
        for (ListNode node : arrayList) {
            newTemp.next = node;
            node.next = null;
            newTemp = node;
        }
        return newhead;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        _86_Partition partition = new _86_Partition();
        partition.partition(node1,3);
    }
}
