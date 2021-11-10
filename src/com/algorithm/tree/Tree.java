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

    static Tree<Integer> root;
    public static void main(String[] args) {
        root = new Tree<>(1);
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
//        System.out.println("-------------------qianxu");
//        root.qianxu(root);
//
//        System.out.println("-------------------zhongxu");
//        root.zhongxu(root);
//
//        System.out.println("-------------------houxu");
//        root.houxu(root);
//
//        System.out.println("-=============");
//        root.cengxubianli(root);
//
        root.delete(6);

        System.out.println("-=============");
        if (root != null){
            root.cengxubianli(root);

        }
    }

    private Queue<Tree> queue = new ArrayDeque<>();
    public void cengxubianli(Tree tree){
        queue.add(tree);
        xxx();
    }
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

    /**
     * 查找也可以使用上面的方法进行
     */
    private void chazhao(){

    }

    /**
     * 树删除需要使用父节点删除
     * 如果某个节点的左子树需要删除，那么就设置为null，返回
     * 右子树同理
     * 否则就向左右子树继续走
     */

    private boolean delete(T t){
        if (root.t == t) {
            root = null;
            return true;
        }
        delete(root,t);
        return false;
    }

    private void delete(Tree tree,T t){
        if (tree == null){
            return;
        }
        //删除不了  值传递和引用传递
        if (tree.left!=null&&tree.left.t == t){
            this.left = null;
            return;
        }

        if (tree.right != null && tree.right.t == t){
            this.right = null;
            return;
        }

        if (tree.left != null){
            this.left.delete(this.left,t);
        }

        if (tree.right != null){
            this.right.delete(this.right,t);
        }
    }

    //-------------------------------------
    private boolean delete1(T t){
        if (root.t == t) {
            if (root.left !=null){
                root = root.left;
            }else if (root.right != null){
                root = root.right;
            }else {
                root = null;
            }
            return true;
        }
        delete1(root,t);
        return false;
    }

    private void delete1(Tree tree,T t){
        if (tree == null){
            return;
        }
        //删除不了  值传递和引用传递
        if (tree.left!=null&&tree.left.t == t){
            this.left = null;
            if (this.left.left!=null){
                this.left = this.left.left;
            }else if (this.left.right!=null){
                this.left = this.left.right;
            }else {
                this.left = null;
            }
            return;
        }

        if (tree.right != null && tree.right.t == t){
            if (this.right.left != null){
                this.right = this.right.left;
            }else if (this.right.right != null){
                this.right = this.right.right;
            }else {
                this.right = null;
            }
            return;
        }

        if (tree.left != null){
            this.left.delete1(this.left,t);
        }

        if (tree.right != null){
            this.right.delete1(this.right,t);
        }
    }

}
