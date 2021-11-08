package com.algorithm.binaryTree;

import java.util.ArrayList;
import java.util.List;
/**
 * @author:28188
 * @date: 2021/6/27
 * @time: 7:01
 *
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 *
 *
 * 中序遍历：
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历
 *
 * 执行用时:0 ms
 * 在所有 Java 提交中击败了  100.00%的用户
 * 内存消耗：
 * 36.8 MB,在所有 Java 提交中击败了 34.50%的用户
 */
public class Question1 {
    public class TreeNode {
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

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        trav(root,list);
        return list;
    }

    public void  trav(TreeNode root, ArrayList<Integer> list){
        if (root!=null){
            trav(root.left,list);
            list.add(root.val);
            trav(root.right,list);
        }
    }

    public void  trav(TreeNode root){
        if (root!=null){
            trav(root.right);
            trav(root.left);
            System.out.println(root.val);
        }
    }
}
