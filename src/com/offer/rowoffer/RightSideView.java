package com.offer.rowoffer;

import com.zhuanti.binaryTree.TreeNode;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class RightSideView {
    private List<Integer> ls = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null)return ls;
        test(root);
        return ls;
    }

    public void test(TreeNode node){
        TreeNode next = null;
        System.out.println(node.val);
        ls.add(node.val);
        if (node.right != null) {
            next = node.right;
        }else if (node.left != null){
            next = node.left;
        }
        if (next == null)return;
        test(next);
    }

    public void cengxu(TreeNode head){
        LinkedBlockingQueue<TreeNode > deque = new LinkedBlockingQueue<>();
        deque.add(head);
        while (deque.isEmpty()) {
            TreeNode pop = deque.remove();
            if (pop == null) {
                continue;
            }
            System.out.println(pop.val);
            deque.add(pop.left);
            deque.add(pop.right);
        }
    }


    public void cengxu1(TreeNode root){
        List<List<Integer>> lists = new ArrayList<>();
        // 判空处理
        if (root == null) {
//            return lists;
        }
        // 这里存放树的节点
        List<TreeNode> nodes = new ArrayList<>();
        // 先把root节点加入节点集合
        nodes.add(root);
        // 如果节点集合有节点需要遍历
        while (!nodes.isEmpty()) {
            // 设置遍历集合大小
            int size = nodes.size();
            // 存放数据
            TreeNode treeNode = nodes.get(nodes.size()-1);
            ls.add(treeNode.val);
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                // 取出第一集合元素，按照加入集合顺序打印
                TreeNode remove = nodes.remove(0);
                // 把节点（类似于根节点）信息加入信息集合
                list.add(remove.val);
                if (remove.left != null) {
                    // 如果有左孩子先加左孩子
                    nodes.add(remove.left);
                }
                if (remove.right != null) {
                    // 如果有右孩子加入右孩子
                    nodes.add(remove.right);
                }
            }
            // 本次数据加入总的数据集合中
            lists.add(list);
        }

    }


    public void cengxu3(TreeNode root){
        List<List<Integer>> lists = new ArrayList<>();
        // 判空处理
        if (root == null) {
//            return lists;
        }
        // 这里存放树的节点
        List<TreeNode> nodes = new ArrayList<>();
        // 先把root节点加入节点集合
        nodes.add(root);
        // 如果节点集合有节点需要遍历
        int last = 0;
        while (!nodes.isEmpty()) {
            // 设置遍历集合大小
            int size = nodes.size();
            // 存放数据
            TreeNode treeNode = nodes.get(nodes.size()-1);
            last = treeNode.val;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                // 取出第一集合元素，按照加入集合顺序打印
                TreeNode remove = nodes.remove(0);
                // 把节点（类似于根节点）信息加入信息集合
                list.add(remove.val);
                if (remove.left != null) {
                    // 如果有左孩子先加左孩子
                    nodes.add(remove.left);
                }
                if (remove.right != null) {
                    // 如果有右孩子加入右孩子
                    nodes.add(remove.right);
                }
            }
            // 本次数据加入总的数据集合中
            lists.add(list);
        }
    }

    public void cengxu4(TreeNode root){
        List<List<Integer>> lists = new ArrayList<>();
        // 判空处理
        if (root == null) {
//            return lists;
        }
        // 这里存放树的节点
        List<TreeNode> nodes = new ArrayList<>();
        // 先把root节点加入节点集合
        nodes.add(root);
        // 如果节点集合有节点需要遍历
        int max = Integer.MIN_VALUE;
        while (!nodes.isEmpty()) {
            // 设置遍历集合大小
            int size = nodes.size();
            // 存放数据
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                // 取出第一集合元素，按照加入集合顺序打印
                TreeNode remove = nodes.remove(0);
                max = Math.max(remove.val,max);
                // 把节点（类似于根节点）信息加入信息集合
                list.add(remove.val);
                if (remove.left != null) {
                    // 如果有左孩子先加左孩子
                    nodes.add(remove.left);
                }
                if (remove.right != null) {
                    // 如果有右孩子加入右孩子
                    nodes.add(remove.right);
                }
            }
            ls.add(max);
            // 本次数据加入总的数据集合中
            lists.add(list);
        }
    }

}
