package com.zhuanti.depthsearch;

import com.algorithm.binaryTree.TreeNode;

/**
 * 记得下来去看更加简洁做法
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p,q);
    }

    public boolean check(TreeNode p,TreeNode q){
        if (p == null && q == null) {
            return true;
        }
        if (p==null&&q!=null || p!=null&&q==null){
            return false;
        }
        if (p.val != q.val) {
            return false;
        }

        return check(p.right,q.right)&& check(p.left,q.left);
    }
}
