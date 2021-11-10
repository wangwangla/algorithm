package com.algorithm.tree;

/**
 * 顺序二叉树
 */
public class OrderTree<T> {
    private Node<Integer> root;
    public static void main(String[] args) {

    }

    public void addNode(T t){
        Node newNode = new Node();
        newNode.d = t;
        if (root == null){
            root = newNode;
        }else {
            addNode(root,t);
        }
    }

    public void addNode(Node node,T t){
        if (node.left == null){
            if (node.left.d == t){

            }
        }
    }
}

class Node<T>{
    public T d;
    public Node left;
    public Node right;
}
