package com.algorithm.binaryTree;

/**
 * @author:28188
 * @date: 2021/6/27
 * @time: 7:39
 */
public class Question03 {
    public class TreeNode {
        int val;
        BuildTree.TreeNode left;
        BuildTree.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, BuildTree.TreeNode left, BuildTree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int numTrees(int n) {
        if (n == 0) {
            return 1;
        }
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}

/**
 * const numTrees = (n) => {
 *   const dp = new Array(n + 1).fill(0);
 *   dp[0] = 1;
 *   dp[1] = 1;
 *   for (let i = 2; i <= n; i++) {
 *     for (let j = 0; j <= i - 1; j++) {
 *       dp[i] += dp[j] * dp[i - j - 1];
 *     }
 *   }
 *   return dp[n];
 * };
 *
 *
 * 给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数。
 *
 *
 *
 *
 * 作者：xiao_ben_zhu
 * 链接：zsolution/shou-hua-tu-jie-san-chong-xie-fa-dp-di-gui-ji-yi-h/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
