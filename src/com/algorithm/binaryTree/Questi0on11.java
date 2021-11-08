package com.algorithm.binaryTree;

/**
 * @author:28188
 * @date: 2021/7/1
 * @time: 6:51
 *
 * 给定一个二叉树，它的每个结点都存放着一个整数值。
 *
 * 找出路径和等于给定数值的路径总数。
 *
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 *
 * 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解题思路：
 *   深度查找
 */
public class Questi0on11 {
//    public static void main(String[] args) {
//        TreeNode node = new TreeNode();
//        node.val = 10;
//        TreeNode node1 = new TreeNode();
//        node1.val = 5;
//        TreeNode node2 = new TreeNode();
//        node2.val = 12;
//        node.left = node1;
//        node.right = node2;
//
//
//        TreeNode node3 = new TreeNode();
//        node3.val = 2;
//        TreeNode node4 = new TreeNode();
//        node4.val= 7;
//        node1.left = node3;
//        node1.right = node4;
//
//        dfs(node);
//    }


    public static void dd(TreeNode node){
        if (node == null)return;
        System.out.println(node.val);
        dd(node.left);
        dd(node.right);
    }

    public static void dfs(TreeNode node){
        if (node == null)return;
        dd(node.left);
        dd(node.right);
        System.out.println(node.val);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(2);
        TreeNode node7 = new TreeNode(2);
        node1.left = node2;
        node2.left = node3;
        node2.right = node4;
        node1.right = node5;
        node5.left = node6;
        node5.right = node7;

        Questi0on11 questi0on11 = new Questi0on11();
        questi0on11.dd(node1);
    }
}
