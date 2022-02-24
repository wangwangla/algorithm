package com.zhuanti.binaryTree;

import java.util.ArrayList;
import java.util.List;

public class _144_PreOrderTree {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        preOrder(root,arrayList);

        return arrayList;
    }

    private void preOrder(TreeNode root,ArrayList<Integer> list){
        if (root==null) {
            return;
        }
        preOrder(root.left,list);
        list.add(root.val);
        preOrder(root.right,list);
    }
}
