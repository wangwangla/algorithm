package com.shuati.offer;

/**
 * @author:28188
 * @date: 2021/4/20
 * @time: 6:51
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * 示例1：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 限制：
 *
 * 0 <= 链表长度 <= 1000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Question20 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode cur = new ListNode(0);
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                ListNode node = new ListNode(l1.val);
                cur.next = node;
                l1 = l1.next;
            }else  {
                ListNode node = new ListNode(l2.val);
                cur.next = node;
                l2 = l2.next;
            }
            if (head == null){
                head = cur;
            }
            cur = cur.next;
        }
        if (l1!=null){
            cur.next = l1;
        }
        if (l2!=null){
            cur.next = l2;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;
        Question20 question20 = new Question20();
        question20.mergeTwoLists1(node1,node4);
    }
}

