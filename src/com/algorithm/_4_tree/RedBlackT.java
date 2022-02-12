package com.algorithm._4_tree;

public class RedBlackT<Key extends Comparable<Key>,Value> {
    private RbNode root;
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

    public int size(){
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

    public void rotateRight(RbNode h){
        RbNode x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
    }

    public void flipColor(RbNode h){
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    public void put(Key key,Value value){
        put(root,key,value);
        root.color = BLACK;
    }

    public RbNode put(RbNode root,Key key,Value value){
        if (root == null){
            N++;
            root = new RbNode(key,value,null,null,RED);
        }
        int i = root.key.compareTo(key);
        if (i>0){
            root.left = put(root.left,key,value);
        }else if (i<0){
            root.right = put(root.right,key,value);
        }else {
            root.value = value;
        }

        if (!isRed(root.left)&&isRed(root.right)){
            rotateLeft(root);
        }
        if (isRed(root.left)&&isRed(root.left.left)){
            rotateRight(root);
        }
        if (isRed(root.left)&&isRed(root.right)){
            flipColor(root);
        }
        return root;
    }


}
