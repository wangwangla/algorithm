package com.zhuanti.depthsearch;

import com.algorithm.binaryTree.TreeNode;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null)return 0;
        int max = Math.max(maxDepth(root.left),maxDepth(root.right));
        return max + 1;
    }
}
