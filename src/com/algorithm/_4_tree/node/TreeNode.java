package com.algorithm._4_tree.node;

/**
 * 左边树  右边树
 */
public class TreeNode<T extends Comparable> {
    public T t;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(){}

    public TreeNode(T t,TreeNode left,TreeNode right){
        this.t = t;
        this.left = left;
        this.right = right;
    }
}
