package com.zhuanti.lianbiao;

import com.zhuanti.binaryTree.ListNode;

/**
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 *
 * 你不需要 保留 每个分区中各节点的初始相对位置。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/partition-list-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MST0204Partition {
    public ListNode partition(ListNode head, int x) {
        ListNode smallNode = new ListNode(0);
        ListNode smallHead = smallNode;
        ListNode largeNode = new ListNode(0);
        ListNode largeHead = largeNode;
        while (head!=null){
            if (head.val<x){
                smallNode.next = head;
                smallNode = smallNode.next;
            }else {
                largeNode.next = head;
                largeNode = largeNode.next;
            }
            head = head.next;
        }
        smallNode.next = largeHead.next;
        return smallHead.next;
    }
}
