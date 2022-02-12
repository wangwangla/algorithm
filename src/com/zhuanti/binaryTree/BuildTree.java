package com.zhuanti.binaryTree;

import java.util.ArrayList;
import java.util.List;
/**
 * @author:28188
 * @date: 2021/6/27
 * @time: 7:14
 *
 * 给你一个整数 n ，请你生成并返回所有由 n 个节点组成且节点值从 1 到 n 互不相同的不同
 * 二叉搜索树 。可以按 任意顺序 返回答案。
 *
 *https://leetcode-cn.com/problems/unique-binary-search-trees-ii/
 *
 *
 * 等二叉树搞明白了，回来重新写
 *
 * 思路：
 * 排列组合   左边比右边小  生成树
 * 二叉树是两个节点
 *
 * 左子树  右子树  先找出左子树 右子树
 *
 * 结果: 前序遍历？？？
 *
 * 1.找出左子树    右子树  保存当前
 * 2.进入左子树    左子树   右子树   保存当前
 * 3.进入右子树   ……
 * 4.如果节点为
 */
public class BuildTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }
    public List<TreeNode> generateTrees(int n) {
        if (n == 0){
            return new ArrayList<>();
        }
        return generaTree(1,n);
    }

    public List<TreeNode> generaTree(int start,int end){
        List<TreeNode> list = new ArrayList<>();
        if (start > end){
            list.add(null);
            return list;
        }

        for (int i = start; i <= end; i++) {
            System.out.println(start +"----------------"+end);
            List<TreeNode> leftNodes = generaTree(start,i-1);
            List<TreeNode> rightNodes = generaTree(i+1,end);
            for (TreeNode leftNode : leftNodes) {
                for (TreeNode rightNode : rightNodes) {
                    TreeNode current = new TreeNode(i);
                    current.left = leftNode;
                    current.right = rightNode;
                    list.add(current);
                }
            }
        }
        return list;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder,  inorder, (long)Integer.MAX_VALUE + 1);
    }
    int pre = 0;
    int in = 0;
    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, long stop) {
        //到达末尾返回 null
        if(pre == preorder.length){
            return null;
        }
        //到达停止点返回 null
        //当前停止点已经用了，in 后移
        if (inorder[in] == stop) {
            in++;
            return null;
        }
        int root_val = preorder[pre++];
        TreeNode root = new TreeNode(root_val);
        //左子树的停止点是当前的根节点
        root.left = buildTreeHelper(preorder,  inorder, root_val);
        //右子树的停止点是当前树的停止点
        root.right = buildTreeHelper(preorder, inorder, stop);
        return root;
    }
    public static void main(String[] args) {
        BuildTree question2 = new BuildTree();
        List<TreeNode> list = question2.generateTrees(3);
        for (TreeNode treeNode : list) {
            print(treeNode);
            System.out.println("-----------");
        }
    }

    public static void print(TreeNode treeNode){
        if (treeNode == null)return;
        System.out.println(treeNode.val);
        print(treeNode.left);
        print(treeNode.right);

    }
}
