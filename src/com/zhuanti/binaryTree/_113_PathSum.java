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
        //因为需要到达根，所有左右都得为null
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



    private ArrayList<List<Integer>> resultList = new ArrayList<>();
    private ArrayList<TreeNode> lists = new ArrayList<>();
    public boolean pathSum1(TreeNode root, int targetSum) {
        if (root==null)return false;
        lists.add(root);
        int result = targetSum- root.val;
        if (result == 0 && null == root.left && null == root.right){
            List<Integer> list = new ArrayList<>();
            for (TreeNode node : lists) {
                list.add(node.val);
            }
            resultList.add(list);
            return true;
        }else{
            boolean flag = pathSum1(root.left, result) || pathSum1(root.right, result);
            lists.remove(root);
            return flag;
        }
    }
}
