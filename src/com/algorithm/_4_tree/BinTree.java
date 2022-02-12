package com.algorithm._4_tree;

import com.algorithm._4_tree.node.TreeNode;

import java.util.Objects;

public class BinTree<T extends Comparable> {

    private TreeNode root;

    public void insert(T t){
         root = insert(root,t);
     }

    private TreeNode insert(TreeNode root, T t) {
         if (root == null){
             return new TreeNode(t,null,null);
         }
         if (t.compareTo(root.t)>0){
             root.left = insert(root.left,t);
         }else if (t.compareTo(root.t)<0){
             root.right = insert(root.right,t);
         }else {
             root.t = t;
         }
         return root;
    }

    public void delete(T t){
         root = delete(root , t);
    }

    private TreeNode delete(TreeNode root, T t) {
         if (root == null){
             return null;
         }
         //找到结点
        if (t.compareTo(root.t)<0){
            root.left = delete(root.left,t);
        }else if (t.compareTo(root.t)>0){
            root.right = delete(root.right,t);
        }else {
            //找到之后
            //左右子树是不是为null
            if (root.right == null){
                return root.left;
            }
            if (root.left ==null){
                return root.right;
            }
            //如果都有，那么就先去找右子树的左子树
            TreeNode rNode = root.right;
            while (rNode.left!=null){
                rNode = rNode.left;
            }
            TreeNode n = rNode.right;
            while (n.left!=null){
                if (n.left.left==null){
                    n.left = null;
                }else {
                    n = n.left;
                }
            }
            root = rNode;
        }
        return root;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BinTree)) return false;
        BinTree<?> tree = (BinTree<?>) o;
        return Objects.equals(root, tree.root);
    }

    @Override
    public int hashCode() {
        return Objects.hash(root);
    }

    public void printQ(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(root.t);
        printQ(root.left);
        printQ(root.right);
    }

    public void printZ(TreeNode root){
        if (root == null){
            return;
        }
        printZ(root.left);
        System.out.println(root.t);
        printZ(root.right);
    }

    public void printH(TreeNode root){
        if (root == null){
            return;
        }
        printH(root.left);
        printH(root.right);

        System.out.println(root.t);
    }


    public static void main(String[] args) {
        BinTree tree = new BinTree();
        tree.insert(3);
        tree.insert(4);
        tree.insert(34);
        tree.insert(42);
        tree.insert(36);
        tree.insert(45);
        tree.insert(31);
        tree.insert(47);
        tree.insert(33);
        tree.insert(40);
        tree.delete(45);
        tree.printH(tree.root);
    }
}
