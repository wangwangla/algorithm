package com.zhuanti.binaryTree;

/**
 * @author:28188
 * @date: 2021/7/2
 * @time: 7:02
 *
 * 左右进行交换
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        afterInvert(root);
        return root;
    }

    private void afterInvert(TreeNode root){
        if (root == null){
            return;
        }
        afterInvert(root.left);
        afterInvert(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
