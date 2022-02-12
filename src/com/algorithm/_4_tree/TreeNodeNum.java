package com.algorithm._4_tree;

import com.algorithm.binaryTree.TreeNode;

public class TreeNodeNum {
    private int countNodes(TreeNode node){
        if (node == null)return 0;
        return 1+countNodes(node.left) + countNodes(node.right);
    }

    private int countNodesM(TreeNode node){
        int h = 0;
        while (node!=null){
            node = node.left;
            h++;
        }
        return (int)Math.pow(2,h)-1;
    }

    private int xxx(TreeNode node){
        if (node == null)return 0;
        int leftH = 0;
        int rightH = 0;
        TreeNode left = node;
        TreeNode right = node;
        while (left.left!=null){
            left = left.left;
            leftH++;
        }

        while (right.right !=null){
            right = right.right;
            rightH ++;
        }

        if (leftH == rightH){
            return (int)Math.pow(2,rightH) - 1;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}
