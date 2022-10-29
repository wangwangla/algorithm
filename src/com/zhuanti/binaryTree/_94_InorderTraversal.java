package com.zhuanti.binaryTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树遍历
 *给定一个二叉树的根节点 root ，返回 它的 中序 遍历
 */
public class _94_InorderTraversal {
    private List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        mid(root);
        return list;
    }

    public void mid(TreeNode root){
        if (root == null)return;
        mid(root.left);
        list.add(root.val);
        mid(root.right);
    }

}
