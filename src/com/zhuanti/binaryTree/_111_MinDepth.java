package com.zhuanti.binaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class _111_MinDepth {
    public int minDepth(TreeNode root) {
        if (root == null)return 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int depth = 0;
        while (queue.size()>0){
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left==null&&poll.right==null)return depth;
                if (poll.left != null){
                    queue.offer(poll.left);
                }
                if (poll.right!=null){
                    queue.offer(poll.right);
                }
            }
        }
        return 0;
    }
}
