package com.zhuanti.breathfristsearch;

import com.algorithm.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> list1 = new ArrayList<>();

        Deque<TreeNode> deque = new LinkedList<>();
        if (root!=null) {
            deque.add(root);
        }
        int index = 0;
        while (!deque.isEmpty()){
            list.clear();
            int size = deque.size();
            if (index % 2 == 0) {
                for (int i = 0; i < size; i++) {
                    TreeNode poll = deque.poll();
                    list.add(poll.val);
                    if (poll.left != null) {
                        deque.add(poll.left);
                    }
                    if (poll.right != null) {
                        deque.add(poll.right);
                    }
                }
            }else {
                for (int i = 0; i < size; i++) {
                    TreeNode poll = deque.poll();
                    list.add(0,poll.val);

                    if (poll.right != null) {
                        deque.add(poll.right);
                    }
                    if (poll.left != null) {
                        deque.add(poll.left);
                    }
                }
            }
            index++;
            list1.add(new ArrayList<>(list));
        }
        return list1;
    }
}
