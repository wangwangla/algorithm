package com.zhuanti.binaryTree;

public class _124_maxPathSum {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        mid(root);
        return ans;
    }

    public int mid(TreeNode root){
        if (root == null)return 0;
        int left = Math.max(0,mid(root.left));
        int right = Math.max(0,mid(root.right));
        ans = Math.max(left + right + root.val,ans);
        return Math.max(left,right)+root.val;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(-2);
        TreeNode left = new TreeNode(1);
//        TreeNode right = new TreeNode(3);

        node.left = left;
//        node.right = right;

        _124_maxPathSum sum = new _124_maxPathSum();
        System.out.println(sum.maxPathSum(node));
    }
}
