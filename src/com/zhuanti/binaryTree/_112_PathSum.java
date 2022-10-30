package com.zhuanti.binaryTree;

public class _112_PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null)return false;
        int result = targetSum- root.val;
        if (result == 0 && null == root.left && null == root.right){
            return true;
        }else{
            return hasPathSum(root.left, result) || hasPathSum(root.right, result);
        }
    }


}
