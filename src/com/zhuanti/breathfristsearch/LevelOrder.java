package com.zhuanti.breathfristsearch;

import com.zhuanti.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> list1 = new ArrayList<>();

        Deque<TreeNode> deque = new LinkedList<>();
        if (root!=null) {
            deque.add(root);
        }
        while (!deque.isEmpty()){
            list.clear();
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = deque.poll();
                list.add(poll.val);
                if (poll.left!=null){
                    deque.add(poll.left);
                }
                if (poll.right != null){
                    deque.add(poll.right);
                }
            }
            list1.add(new ArrayList<>(list));
        }
        return list1;
    }
    public List<List<Integer>> templete(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        if (root!=null) {
            deque.add(root);
        }
        while (!deque.isEmpty()){
            TreeNode poll = deque.poll();
            System.out.println(poll.val);
            if (poll.left!=null){
                deque.add(poll.left);
            }
            if (poll.right != null){
                deque.add(poll.right);
            }
        }
        return null;
    }
}
