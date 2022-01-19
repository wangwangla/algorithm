package com.algorithm.tree;

public class RedBlackT<Key extends Comparable<Key>,Value> {
    private Node root;
    private int N;
    private final boolean RED = true;
    private final boolean BLACK = false;

    private class RbNode{
        private Key key;
        private Value value;
        private RbNode left;
        private RbNode right;
        public boolean color;

        public RbNode(Key key,Value value,RbNode left,RbNode right,boolean color){
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.color = color;
        }

    }

    public int sizre(){
        return N;
    }

    public boolean isRed(RbNode x){
        if (x == null)return false;
        return x.color == RED;
    }

    public void rotateLeft(RbNode h){
        RbNode x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
    }

    public void rotateLeft(RbNode h){
        RbNode x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
    }
}
