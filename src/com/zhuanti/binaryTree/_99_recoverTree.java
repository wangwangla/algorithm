package com.zhuanti.binaryTree;

/**
 * 给你二叉搜索树的根节点 root ，该树中的 恰好 两个节点的值被错误地交换。
 * 请在不改变其结构的情况下，恢复这棵树 。
 */
public class _99_recoverTree {
    //恰有两个，那就找到两个直接替换
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = t1.val;
        t1.val  = t2.val;
        t2.val = temp;
    }
    TreeNode t1, t2, pre;
    public void inorder(TreeNode root){
        if (root == null) return ;
        inorder(root.left);
        if (pre != null && pre.val > root.val) {
            if (t1 == null) t1 = pre;
            t2 = root;
        }else {
            pre = root;
        }
        inorder(root.right);
    }
}
