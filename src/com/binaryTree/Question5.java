package com.binaryTree;

/**
 * @author:28188
 * @date: 2021/6/27
 * @time: 8:25
 */
public class Question5 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        int i = maxDepth(root.left);
        int i1 = maxDepth(root.right);
        if (root == null){
            return 0;
        }
        int max = Math.max(i, i1);
        return max+1;
    }
}
