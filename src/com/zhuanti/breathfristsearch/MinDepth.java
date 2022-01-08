package com.zhuanti.breathfristsearch;

import com.algorithm.binaryTree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class MinDepth {
    public int minDepth(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        int depth = 0;
        if (root!=null) {
            deque.add(root);
        }
        while (!deque.isEmpty()){
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = deque.poll();
                if (poll.left!=null){
                    deque.add(poll.left);
                }
                if (poll.right != null){
                    deque.add(poll.right);
                }
                if (poll.left == null && poll.right==null){
                    return depth;
                }
            }
            depth++;
        }
        return 0;
    }
}
