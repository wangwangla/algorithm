package com.algorithm.binaryTree;

import com.beust.ah.A;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.*;

/**
 * @author:28188
 * @date: 2021/6/28
 * @time: 8:14
 *
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 *
 */
public class CengxuBianli {
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

    public void bl(TreeNode root){
        if (root==null)return;
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.addLast(root);
        List<List<Integer>> list = new ArrayList<>();
        while (!stack.isEmpty()){
            int size = stack.size();
            List<Integer> aa = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode pop = stack.removeFirst();
                aa.add(pop.val);
                if (pop.left!=null){
                    stack.addLast(pop.left);
                }
                if (pop.right!=null){
                    stack.addLast(pop.right);
                }
            }
            list.add(aa);
        }
        System.out.println(list);
    }

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int i = maxDepth(root.left);
        int i1 = maxDepth(root.right);

        int max = Math.max(i, i1);
        List list = null;
        if (hashMap.containsKey(max+1)) {
            list = hashMap.get(max+1);
        }else {
            list = new ArrayList();
        }
        list.add(root.val);
        hashMap.put(max,list);
        return max+1;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node2.left = node3;
        node2.right = node4;
        node1.right = node5;
        node5.left = node6;
        node5.right = node7;

        CengxuBianli cengxuBianli = new CengxuBianli();
        cengxuBianli.bl(node1);
//        System.out.println(cengxuBianli.levelOrder(node1));
    }

    public int getMax(TreeNode root){
        if (root == null){
            return 0;
        }
        int i = getMax(root.left);
        int i1 = getMax(root.right);
        int max = Math.max(i,i1)+1;
        return max;
    }
}
