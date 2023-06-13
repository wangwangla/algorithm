package com.labuladong._1_chapterone;

import com.zhuanti.binaryTree.TreeNode;

public class _113_BinaTree {
    //二叉树的遍历
    public void traverse(TreeNode head){
        traverse(head.left);
        traverse(head.right);
    }

    //最大路径
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

    TreeNode pre,t1,t2;
    public void recoverTree(TreeNode root) {
        midBianli(root);
        int val = t1.val;
        t1.val = t2.val;
        t2.val = val;
    }

    public void midBianli(TreeNode root){
        recoverTree(root.left);
        if (pre!=null && pre.val > root.val){
            if (t1 == null){
                t1 = pre;
            }
            t2 = root;
        }
        pre = root;
        recoverTree(root.right);
    }
}
