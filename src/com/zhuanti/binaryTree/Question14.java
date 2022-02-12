package com.zhuanti.binaryTree;

/**
 * @author:28188
 * @date: 2021/7/2
 * @time: 7:11
 *
 * 最小深度
 */
public class Question14 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(2);
        TreeNode node7 = new TreeNode(2);
        node1.left = node2;
        node2.left = node3;
        node2.right = node4;
        node1.right = node5;
        node5.left = node6;
        node5.right = node7;

        Question14 question14 = new Question14();
        int i = question14.minDepth(node1);
        System.out.println(i);

    }

    public int minDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        int i = minDepth(root.left);
        int i1 = minDepth(root.right);
        if (i==0 || i1 == 0)return 1+i+i1;

        int min = Math.min(i, i1);
        return min+1;
    }
}
