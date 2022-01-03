package com.rowoffer;

import com.algorithm.binaryTree.TreeNode;

import java.util.ArrayList;

/**
 * 和最大的路径，虽然不会，那我写一下，深度遍历吧   并得到每一个路径
 */
public class MaxPathSum {
    public int maxPathSum(TreeNode root) {
        ArrayList<TreeNode> arrayList = new ArrayList<>();
        xxx(root,arrayList);
        return 0;
    }

    private void xxx(TreeNode root,ArrayList<TreeNode> arrayList){
        if (root == null){
            System.out.println(arrayList.toString());
        }
        arrayList.add(root);
        xxx(root.left,arrayList);
        xxx(root.right,arrayList);
    }


    public void getMax(ArrayList<TreeNode> list){
        int sum = 0;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            TreeNode treeNode = list.get(i);
            int val = treeNode.val;
        }
    }
}
