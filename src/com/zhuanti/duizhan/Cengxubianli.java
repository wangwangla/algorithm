package com.zhuanti.duizhan;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

class TreeNode {
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
public class Cengxubianli {
    public void cengxubianli(TreeNode head){
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(head);
        while (deque.isEmpty()){
            TreeNode pop = deque.pop();
            if (pop == null){
                continue;
            }
            System.out.println(pop.val);
//            if (pop.left!=null) {
//                deque.push(pop.left);
//            }
//            if (pop.right == null){
//                deque.push(pop.right);
//            }
            deque.push(pop.left);
            deque.push(pop.right);
        }
    }

    ArrayList<TreeNode> arrayList = new ArrayList<>();
    public void qianxu(TreeNode head){
        if (head == null)return;
        arrayList.add(head);
        qianxu(head);
        qianxu(head);
    }

    public void tets(TreeNode node){
        qianxu(node);
        for (int i = 0; i < arrayList.size()-1; i++) {
            TreeNode treeNode = arrayList.get(i);
            treeNode.left = null;
            treeNode.right = arrayList.get(i+1);
        }
    }

    /**
     * 还有一个就是中序遍历，  中序搜索树那么应该是递增的，那么前一个肯定比后一个小，使用一个值存储上一个值，观察大小
     * @param head
     */
    public void feidiguiqianxu(TreeNode head){
        if (head == null) {
            return;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(head);
        TreeNode pre = null;
        while (!deque.isEmpty()){
            TreeNode pop = deque.pop();
            if (pre!=null){
                //左子树 为null  右子树设置值
                pre.left  = null;
                pre.right = pop;
            }
            TreeNode left = pop.left;
            TreeNode right = pop.right;
            if (right!=null) {
                deque.push(right);
            }
            if (left!=null) {
                deque.push(left);
            }

        }
    }
}
