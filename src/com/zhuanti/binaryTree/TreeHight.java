package com.zhuanti.binaryTree;

/**
 * @author:28188
 * @date: 2021/6/30
 * @time: 7:28
 *
 * 树高  并且左右不超过1
 */
public class TreeHight {
    public boolean hight(TreeNode root){
        return height(root) >= 0;
    }

    private int height(TreeNode root) {
        if(root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        if(lh >= 0 && rh >= 0 && Math.abs(lh - rh) <= 1) {
            return Math.max(lh, rh) + 1;
        } else {
            return -1;
        }
    }
}
