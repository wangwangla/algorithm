package com.binaryTree;

/**
 * @author:28188
 * @date: 2021/6/30
 * @time: 7:34
 */
public class Question10 {
//    给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
//
//    叶子节点 是指没有子节点的节点。
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/path-sum
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
//    深度速索
    public void dfs(TreeNode node){
        System.out.println(node.val);
        if (node.left == null && node.right == null) {
            System.out.println(node.val);
        }
        dfs(node.left);
        dfs(node.right);
    }
}
