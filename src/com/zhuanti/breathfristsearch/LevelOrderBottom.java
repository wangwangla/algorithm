package com.zhuanti.breathfristsearch;

import com.zhuanti.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        if (root!=null) {
            deque.add(root);
        }
        while (!deque.isEmpty()){
            int size = deque.size();
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = deque.poll();
//            System.out.println(poll.val);
                res.add(poll.val);
                if (poll.left!=null){
                    deque.add(poll.left);
                }
                if (poll.right != null){
                    deque.add(poll.right);
                }
            }
            list.add(0,res);
        }
        return list;
    }
}
