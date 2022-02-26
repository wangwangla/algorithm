package com.letcode;

import com.zhuanti.binaryTree.TreeNode;

import java.util.*;

public class _1305_GetAllElements {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        bianli(list,root1);
        bianli(list,root2);
        Collections.sort(list);
        return list;
    }

    private void bianli(List<Integer> list, TreeNode root1) {
        if (root1==null) {
            return;
        }
        bianli(list,root1.left);
        list.add(root1.val);
        bianli(list,root1.right);
    }
}
