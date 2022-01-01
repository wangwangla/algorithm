package com.algorithm.binaryTree;

/**
 * 遍历顺序
 */
public class BianLiType {
    public static void preOrder(TreeNode node){
        if (node == null)return;
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void afterOrder(TreeNode node){
        if (node == null)return;
        afterOrder(node.left);
        afterOrder(node.right);
        System.out.println(node.val);
    }

    public static void midOrder(TreeNode node){
        if (node == null)return;
        midOrder(node.left);
        System.out.println(node.val);
        midOrder(node.right);
    }


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

        BianLiType bianLiType = new BianLiType();
        bianLiType.preOrder(node1);
    }
}
