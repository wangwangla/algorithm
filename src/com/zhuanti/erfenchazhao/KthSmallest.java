package com.zhuanti.erfenchazhao;

import com.algorithm.binaryTree.TreeNode;

import java.util.ArrayList;

public class KthSmallest {
    ArrayList<Integer> a = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        xx(root);
        return a.get(k);
    }

    public void xx(TreeNode roo){
        if (roo==null) {
            return;
        }
        xx(roo.left);
        a.add(roo.val);
        xx(roo.right);
    }
}
