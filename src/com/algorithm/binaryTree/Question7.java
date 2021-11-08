package com.algorithm.binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * @author:28188
 * @date: 2021/6/28
 * @time: 8:14
 *
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 */
public class Question7 {
    private HashMap<Integer,List<Integer>> hashMap = new HashMap<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lis = new ArrayList();
        int i = maxDepth(root);
        for (int i1 = i; i1 >=0; i1--) {
            List<Integer> integers = hashMap.get(i1);
            if (integers!=null)
            lis.add(integers);
        }

        return lis;
    }

    public int maxDepth(TreeNode root) {
        int i = maxDepth(root.left);
        int i1 = maxDepth(root.right);
        if (root == null){
            return 0;
        }

        int max = Math.max(i, i1);
        List list = null;
        if (hashMap.containsKey(i)) {
            list = hashMap.get(i);
        }else {
            list = new ArrayList();
        }
        list.add(root.val);
        hashMap.put(max+1,list);
        return max+1;
    }
}
