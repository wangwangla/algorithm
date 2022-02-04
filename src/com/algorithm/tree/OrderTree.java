package com.algorithm.tree;

/**
 * 顺序二叉树
 */
public class OrderTree<T extends Comparable> {
    private Node<Integer> root;
    public static void main(String[] args) {

    }

    public void addNode(T t){
        Node newNode = new Node();
        newNode.d = t;
        if (root == null){
            root = newNode;
        }else {
            root = addNode(root,t);
        }
    }

    public Node addNode(Node node,T t){
        if (node == null){
            Node node1 = new Node();
            node1.d = t;
            return node1;
        }
        if (t.compareTo(node.d)>0){
            node.right = addNode(node.right,t);
        }else if (t.compareTo(node.d)<0){
            node.left = addNode(node.left,t);
        }else {
            node.d = t;
        }
        return node;
    }
}

class Node<T extends Comparable>{
    public T d;
    public Node left;
    public Node right;
}
