package com.zhuanti.tree;

import com.zhuanti.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    int ccc = 0;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ccc = targetSum;
        List<List<TreeNode>> list = new ArrayList<>();
        List<TreeNode> list1 = new ArrayList<>();
        int num = 0;
        dfs(root,list1,num);
        return null;
    }

    public boolean dfs(TreeNode root,List<TreeNode> list,int num){
        if (root==null){
//            for (TreeNode node : list) {
//                System.out.print(node.val);
//            }
//            System.out.println();
            if (num == ccc){
                for (TreeNode node : list) {
                    System.out.print(node.val);
                }
            }
            return true;
        }
        list.add(root);
        num+=root.val;
        boolean dfs = dfs(root.left, list, num);
        if (dfs) {
            dfs(root.right, list, num);
        }
        list.remove(root);
        num -= root.val;
        return false;
    }

    public static void main(String[] args) {

    }
}
