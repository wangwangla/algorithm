package com.labuladong.chapterone;

import com.algorithm.binaryTree.ListNode;
import com.algorithm.binaryTree.TreeNode;

import java.util.LinkedList;

public class _112_Traverse {
    private void traverse1(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private void travese2(ListNode head){
        for (ListNode node = head;node!=null;node= node.next){
            System.out.println(node.val);
        }
    }

    private void traverse2(ListNode head){
        if (head==null){
            return;
        }
        System.out.println("链表前序");
        travese2(head.next);
        System.out.println("链表后");
    }

//    反转   后序
    public ListNode rev(ListNode head){
        if (head==null || head.next == null)return head;
        ListNode rev = rev(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }

    public int ans = Integer.MIN_VALUE;
    int oneSideMax(TreeNode root){
        if (root == null)return 0;
        int left = Math.max(0,oneSideMax(root.left));
        int right = Math.max(0,oneSideMax(root.right));
        return Math.max(left,right)+root.val;
    }

    private void traverse1(ListNode head){
        while (head!=null){
            //顺序
            System.out.println(head.val);
            head = head.next;
            //逆序
            System.out.println(head.val);
        }
    }

    public void br(int arr[], LinkedList<Integer> track){
        if (track.size() == arr.length){
            System.out.println("----");
        }
        for (int i = 0; i < arr.length; i++) {
            if (track.contains(arr[i])){
                continue;
            }
            track.add(arr[i]);
            br(arr,track);
            track.removeLast();
        }
    }

    /**
     * 全排列
     * @param arr
     * @param v
     * @param track
     */
    public void br(int arr[], int v[] ,LinkedList<Integer> track){
        if (track.size() == arr.length){
            System.out.println("----");
        }
        for (int i = 0; i < arr.length; i++) {
            if (v[i] == 1)continue;
            v[i] = 1;
            track.add(arr[i]);
            br(arr,track);
            track.removeLast();
            v[i] = 0;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        _112_Traverse traverse = new _112_Traverse();
        traverse.rev(node1);
        System.out.println("--------------------------");

    }


}
