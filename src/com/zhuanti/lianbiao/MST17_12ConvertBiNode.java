package com.zhuanti.lianbiao;

import com.zhuanti.binaryTree.TreeNode;

import java.util.ArrayList;

public class MST17_12ConvertBiNode {
    ArrayList<TreeNode> arrayList = new ArrayList<>();
    public TreeNode convertBiNode(TreeNode root) {
        TreeNode head = new TreeNode(0);
        TreeNode node = head;
        midleBianLi(root,node);
//        node.left = null;
//        node.right = null;

//        for (int i = 0; i < arrayList.size(); i++) {
//            node.right = arrayList.get(i);
//            node.left = null;
//            node = node.right;
//            node.left = null;
//            node.right = null;
//        }
        return head.right;
    }
//    TreeNode head = new TreeNode(0);
//
    public void midleBianLi(TreeNode node,TreeNode head){
        if (node == null)return;
        midleBianLi(node.left,head);
//        arrayList.add(node);
        head.right = node;
        head.left = null;
        head = head.right;
        midleBianLi(node.right,head);
    }
}
