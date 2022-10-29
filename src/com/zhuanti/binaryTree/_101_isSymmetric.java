package com.zhuanti.binaryTree;

public class _101_isSymmetric {
    public boolean isSymmetric(TreeNode root) {

        return false;
    }

    private boolean isSymmetric(TreeNode node1,TreeNode node2){
        if (node1==null&&node2==null)return true;
        if (node1==null || node2==null)return false;
        if (node1.val != node2.val)return false;
        return isSymmetric(node1.left,node2.right)&&isSymmetric(node1.right,node2.left);
    }
}
