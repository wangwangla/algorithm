package com.zhuanti.binaryTree;

/**
 * 有序数组变为二叉树
 *
 * 每次取中间的做根
 */
public class _108_sortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    public TreeNode helper(int []nums,int left,int right){
        if (left > right)return null;
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,left,mid-1);
        root.right = helper(nums,mid+1,right);
        return root;
    }
}
