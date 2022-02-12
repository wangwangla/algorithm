package com.zhuanti.binaryTree;

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
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(9);
        TreeNode node5 = new TreeNode(8);
        TreeNode node6 = new TreeNode(5);
        node1.left = node2;
        node2.left = node3;
        node3.right = node6;
        node2.right = node4;
        node4.left = node5;
        BianLiType bianLiType = new BianLiType();
        bianLiType.afterOrder(node1);
        System.out.println(bianLiType.getMax(node1));
    }

    public int getMax(TreeNode root){
        if (root==null)return 0;
        int maxLeft = getMax(root.left);
        int maxRight = getMax(root.right);
        return Math.max(maxLeft,maxRight)+1;
    }
}
