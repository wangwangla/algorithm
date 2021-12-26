package com.rowoffer;

import com.algorithm.binaryTree.TreeNode;

/**
 * 后续遍历怎么实现？？？？？？？？？？？？？？？、
 */
public class PruneTree {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null)return null;
        pruneTree(root.left);
        pruneTree(root.right);
        if (root.val == 0 && root.right == null && root.left == null){
            root = null;
        }
        return root;
    }
}
