package com.zhuanti.binaryTree;

import java.util.ArrayList;

/**
 * 展开和前序相同
 */
public class _114_flatten {
    private ArrayList<TreeNode> arrayList = new ArrayList();

    public void flatten(TreeNode root) {
        pre(root);
        for (int i = 0; i < arrayList.size() - 1; i++) {
            TreeNode treeNode = arrayList.get(i);
            treeNode.left = null;
            treeNode.right = arrayList.get(i + 1);
        }
    }

    public void pre(TreeNode root) {
        if (root == null) return;
        arrayList.add(root);
        pre(root.left);
        pre(root.right);
    }

    private TreeNode pre = null;
    public void flatten1(TreeNode root) {
        if (root == null) return;
        if (pre == null){
            pre = root;
        }else {
            pre.right = root;
            pre.left = null;
            pre = root;
        }
        TreeNode node = root.right;
        pre(root.left);
        pre(node);
    }
}
