package com.algorithm.binaryTree;

import java.util.ArrayList;

/**
 * @author:28188
 * @date: 2021/6/27
 * @time: 8:12
 *
 *
 */
public class Question4 {
    static class TreeNode {
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

    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        trav(root,list);
        if (list.size()%2 == 0) {
            return false;
        }else {
            for (int i = 0; i < list.size() / 2; i++) {
                if (list.get(i) != list.get(list.size()-i-1)){
                    return false;
                }
            }
        }
        return true;
    }

    public void trav(TreeNode root, ArrayList<Integer> list) {
        if (root != null) {
            trav(root.left, list);
            list.add(root.val);
            trav(root.right, list);
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        node.left = node1;

    }
}
