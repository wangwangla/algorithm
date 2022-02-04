package com.algorithm.binaryTree;

import java.util.ArrayList;

/**
 * @author:28188
 * @date: 2021/6/27
 * @time: 8:12
 *
 *  是不是对称
 *
 *  解题 思路：
 *  先将数据放入list中，将值进行比较是不是对称的
 */
public class IsSymmetric {
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


    public boolean isSymmetric1(TreeNode left,TreeNode right){
        if (left==null&&right!=null)return false;
        if (left!=null&&right == null)return false;
        if (left.val!=right.val){
            return false;
        }
        return isSymmetric1(left.left,right.right) &&
                isSymmetric1(left.right,left.right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        node.left = node1;
    }
}
