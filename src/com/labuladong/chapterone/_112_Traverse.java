package com.labuladong.chapterone;

import com.algorithm.binaryTree.ListNode;

public class _112_Traverse {
    private void traverse1(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
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
}
