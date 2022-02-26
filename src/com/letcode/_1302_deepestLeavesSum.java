package com.letcode;

import com.zhuanti.binaryTree.TreeNode;

public class _1302_deepestLeavesSum {
    int de = 0;
    int count = 0;
    public int deepestLeavesSum(TreeNode root) {
        de = maxDepth(root);
        find(root,1);
        return count;
    }

    private void find(TreeNode root, int i) {
        if (root == null)return;
        if (i==de){
            count+=root.val;
        }
        i++;
        find(root.left,i);
        find(root.right,i);
    }

    public int maxDepth(TreeNode root){
        if (root == null)return 0;
        int i = maxDepth(root.left);
        int i1 = maxDepth(root.right);
        return  Math.max(i,i1)+ 1;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(1);
        node.left = node2;
        node.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        _1302_deepestLeavesSum sum = new _1302_deepestLeavesSum();
        sum.deepestLeavesSum(node);

    }
}
