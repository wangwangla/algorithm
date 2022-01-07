package com.zhuanti.erfenchazhao;

import com.algorithm.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class KthSmallest {
    /**
     * 第k小
     */
    int index = 0;
    TreeNode node;
//    ArrayList<Integer> a = new ArrayList<>();
    public int kthSmallest1(TreeNode root, int k) {
        xx(root,k);
//        System.out.println(a);
//        return a.get(k-1);
        return node.val;
    }

    public void xx(TreeNode roo,int k){
        if (roo==null) {
            return;
        }
        if (index >= k){
            return;
        }
        xx(roo.left,k);
        index++;
        if (index==k){
            node = roo;
        }
//        a.add(roo.val);
        if (index>=k)return;
        xx(roo.right,k);
    }


    //层序遍历
//    public int kthSmallest(TreeNode root, int k) {
//        Deque<TreeNode> deque = new LinkedList<>();
//        deque.addLast(root);
//        int index = 0;
//        while (!deque.isEmpty()){
//            TreeNode node = deque.removeFirst();
//            if (index == k){
//                return node.val;
//            }
//            index++;
//            if (node.left!=null){
//                deque.addLast(node);
//            }
//            if (node.right != null){
//                deque.addLast(node);
//            }
//        }
//        return a.get(k);
//    }

}
