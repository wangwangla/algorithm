package com.algorithm.binaryTree;

/**
 * @author:28188
 * @date: 2021/7/2
 * @time: 7:02
 */
public class Question13 {
    public TreeNode invertTree(TreeNode root) {
        ssss(root);
        return root;
    }

    private void ssss(TreeNode root){
        if (root == null){
            return;
        }
        ssss(root.left);
        ssss(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
