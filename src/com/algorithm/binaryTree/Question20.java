package com.algorithm.binaryTree;

import java.util.*;
/**
 * @author:28188
 * @date: 2021/7/5
 * @time: 7:56
 */
public class Question20 {
    private TreeNode sortListedToBst(ListNode head){
        //平衡二叉树  找中间结点   二分
        if(head == null)return null;
        if(head.next == null)return new TreeNode(head.val);
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        return buildTree(0, list.size() - 1, list);
    }

    TreeNode buildTree(int left, int right, List<Integer> list){
        if(left > right)return null;
        //找中心
        int mid = left + (right - left + 1) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = buildTree(left, mid - 1, list);
        root.right = buildTree(mid + 1, right, list);
        return root;
    }
}
