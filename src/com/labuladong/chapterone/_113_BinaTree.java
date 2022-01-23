package com.labuladong.chapterone;

import com.algorithm.binaryTree.TreeNode;

public class _113_BinaTree {
    public void traverse(TreeNode head){
        traverse(head.left);
        traverse(head.right);
    }

    public int maxPathSum(TreeNode head){
        int left = maxPathSum(head.left);
        int right = maxPathSum(head.right);
        return head.val + Math.max(left,right);
    }

//    99  114  构建树


}
