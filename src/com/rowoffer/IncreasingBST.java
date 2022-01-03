package com.rowoffer;

import com.algorithm.binaryTree.TreeNode;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.ArrayList;

public class IncreasingBST {
    ArrayList<TreeNode> arrayList = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
//        xx(root);
        for (int i = 0; i < arrayList.size()-1; i++) {
            TreeNode node1 = arrayList.get(i);
            TreeNode node2 = arrayList.get(i+1);
            node1.left = null;
            node2.left = null;
            node1.right = null;
            node2.right = null;
            node1.right = node2;
            node1.left = null;
        }
        return arrayList.size()>0?arrayList.get(0):null;
    }


    public TreeNode increasingBST1(TreeNode root) {
        xxx(root);
        if (pre!=null){
            pre.right = null;
            pre.left = null;

        }
        return head;
    }

    TreeNode head = null;
    TreeNode pre = null;
    public void xxx(TreeNode root){
        if (root == null) {
            return;
        }
        xxx(root.left);
        if (pre ==null){
            pre = root;
            head = pre;
        }else {
            pre.right = root;
            pre.left = null;
        }
//        arrayList.add(root);
        xxx(root.right);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(3);
        node1.left = node2;
        node1.right = node4;
        node4.left = node3;
        IncreasingBST bst = new IncreasingBST();
        TreeNode node = bst.increasingBST(node1);
        System.out.println();
    }
}
