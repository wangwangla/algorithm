package com.labuladong.chapterone;

import com.algorithm.binaryTree.TreeNode;

public class _113_BinaTree {
    public void traverse(TreeNode head){
        traverse(head.left);
        traverse(head.right);
    }

    int ans = Integer.MIN_VALUE; 
    public int maxPathSum(TreeNode head){
        int left = maxPathSum(head.left);
        int right = maxPathSum(head.right);
        ans = left + right + head.val;
        return head.val + Math.max(left,right);
    }

//    99  114  构建树
//    private TreeNode buildTree(TreeNode root){
//    }


}
