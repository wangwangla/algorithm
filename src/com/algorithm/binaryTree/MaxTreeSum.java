package com.algorithm.binaryTree;

public class MaxTreeSum {
    public static void main(String[] args) {

    }

    /**
     * 单个最大
     * @param num
     * @param root
     * @return
     */
    public int max(int num,TreeNode root){
        if (root == null)return 0;
        int left = max(num,root.left);
        int right = max(num,root.right);
        int max = Math.max(left, right) + root.val;
        return max;
    }


    /**
     * 找出目标值  从根找
     */
    public boolean findTarget(int target,TreeNode treeNode){
        if (treeNode==null)return false;
        if (target == treeNode.val + target){
            return true;
        }
        boolean left = findTarget(target,treeNode.left);
        boolean right = findTarget(target,treeNode.right);
        return left | right;
    }
}
