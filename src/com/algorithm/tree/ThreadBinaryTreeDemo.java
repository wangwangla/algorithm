package com.algorithm.tree;

public class ThreadBinaryTreeDemo {
    public static void main(String[] args) {
//        HeroNode root = new HeroNode(1,"tom");
//ThreadBinaryTree
    }
}

class ThreadedBinaryTree{
    private HeroNode root;
    private HeroNode pre;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    public void threadedNodes(){
        this.threadedNodes(root);
    }

    private void threadedNodes(HeroNode node) {
        if (node == null) {
            return;
        }
        threadedNodes(node.getLeft());
        if (node.getLeft() == null){
            node.setLeft(pre);
            node.setLeftType(1);
        }
        if (pre != null && pre.getRight()  == null){
            pre.setRight(node);
            pre.setRightType(1);
        }
        pre = node;
        threadedNodes(node.getRight());
    }

    public void delNode(int no){
        if (root != null){
            if (root.getNo() == no){
                root = null;
            }else {
                root.delNode(no);
            }
        }else {

        }
    }

    public void preOrder(){
        if (this.root != null){
            this.root.preOrder();
        }else {

        }
    }
    public void threadList(){
        HeroNode node = root;
        while (node.getLeftType() == 0){
            node = node.getLeft();
            while (node.getRightType() == 1){
                node = node.getRight();
            }
            node = node.getRight();
        }
    }
}
