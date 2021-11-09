package com.algorithm.tree;

import com.algorithm.dongtaiguihua.Question1;

import java.util.ArrayDeque;
import java.util.Queue;

public class Tree<T> {
    private T t;
    private Tree left;
    private Tree right;

    public Tree(){

    }

    public Tree(T t){
        this.t = t;
    }


    public void qianxu(Tree<T> tree){
        if (tree == null)return;
        System.out.println(tree.t);
        qianxu(tree.left);
        qianxu(tree.right);
    }

    public void zhongxu(Tree<T> tree){
        if (tree == null)return;
        zhongxu(tree.left);
        System.out.println(tree.t);
        zhongxu(tree.right);
    }

    public void houxu(Tree<T> tree){
        if (tree == null)return;
        houxu(tree.left);
        houxu(tree.right);
        System.out.println(tree.t);
    }


    public static void main(String[] args) {
        Tree<Integer> root = new Tree<>(1);
        Tree<Integer> node1 = new Tree<>(2);
        Tree<Integer> node2 = new Tree<>(3);
        Tree<Integer> node3 = new Tree<>(4);
        Tree<Integer> node4 = new Tree<>(5);
        Tree<Integer> node5 = new Tree<>(6);
        root.left = node1;
        root.right = node2;
        root.left.left = node3;
        root.left.right = node4;
        root.right.left = node5;
        System.out.println("-------------------qianxu");
        root.qianxu(root);

        System.out.println("-------------------zhongxu");
        root.zhongxu(root);

        System.out.println("-------------------houxu");
        root.houxu(root);

        System.out.println("-=============");
        root.queue.add(root);
        root.xxx();

    }

    private Queue<Tree> queue = new ArrayDeque<>();
    public void xxx(){

        if (queue.isEmpty())return;
        Tree tree = queue.poll();
        System.out.println(tree.t);
        if (tree.left!=null) {
            queue.add(tree.left);
        }
        if (tree.right!=null) {
            queue.add(tree.right);
        }
        xxx();
    }
}
