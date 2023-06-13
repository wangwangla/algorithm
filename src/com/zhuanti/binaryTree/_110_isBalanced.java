package com.zhuanti.binaryTree;

public class _110_isBalanced {
    public boolean isBalanced(TreeNode root) {
        int leftMaxDepth = getMaxDepth(root.left);
        int rightMaxDepth = getMaxDepth(root.right);
        return Math.abs(leftMaxDepth - rightMaxDepth)<=1;
    }

    public int getMaxDepth(TreeNode root){
        if (root == null)return 0;
        int maxDepth = getMaxDepth(root.left);
        int maxDepth1 = getMaxDepth(root.right);
        if (maxDepth1>=0&&maxDepth>=0&&Math.abs(maxDepth1-maxDepth)<=1){
            return Math.max(maxDepth1,maxDepth)+1;
        }
        return -1;
    }
}
