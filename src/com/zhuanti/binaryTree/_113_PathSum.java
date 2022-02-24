package com.zhuanti.binaryTree;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.List;

public class _113_PathSum {
    int ccc = 0;
    ArrayList<List<Integer>> arrayList = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ccc = targetSum;
        List<TreeNode> list1 = new ArrayList<>();
        int num = 0;
        dfs(root,list1,num);
        return arrayList;
    }

    public void dfs(TreeNode root,List<TreeNode> list,int num){
        if (root==null){
            return;
        }
        if (root.left==null&&root.right==null) {
            if (num == ccc) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (TreeNode node : list) {
//                    System.out.print(node.val);
                    temp.add(node.val);
                }
                arrayList.add(temp);
            }
        }
        list.add(root);
        num+=root.val;
        dfs(root.left,list,num);
        dfs(root.right,list,num);
        list.remove(root);
        num -= root.val;
    }
}
