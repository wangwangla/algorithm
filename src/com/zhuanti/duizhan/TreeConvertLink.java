package com.zhuanti.duizhan;

public class TreeConvertLink {
    public TreeNode convertBiNode(TreeNode root) {
        return null;
    }

    private TreeNode node;
    public void inOrder(TreeNode head){
        if (head == null){
            return;
        }
        inOrder(head.left);
        head.right = node;
        node = head;
        inOrder(head.right);
        head.left = null;
    }
}
