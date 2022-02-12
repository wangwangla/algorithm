package com.algorithm._4_tree;

import com.algorithm._4_tree.node.TreeNode;

/**
 * 顺序二叉树
 */
public class OrderTree<T extends Comparable> {
    private TreeNode<Integer> root;
    public static void main(String[] args) {

    }

    public void addNode(T t){
        TreeNode newNode = new TreeNode();
        newNode.t = t;
        if (root == null){
            root = newNode;
        }else {
            root = addNode(root,t);
        }
    }

    public TreeNode addNode(TreeNode node,T t){
        if (node == null){
            TreeNode node1 = new TreeNode();
            node1.t = t;
            return node1;
        }
        if (t.compareTo(node.t)>0){
            node.right = addNode(node.right,t);
        }else if (t.compareTo(node.t)<0){
            node.left = addNode(node.left,t);
        }else {
            node.t = t;
        }
        return node;
    }
}


