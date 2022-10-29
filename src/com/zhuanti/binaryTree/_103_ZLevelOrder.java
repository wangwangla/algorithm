package com.zhuanti.binaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class _103_ZLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> listList = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        boolean revse = false;
        while (queue.size()>0){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left!=null) {
                    queue.offer(poll.left);
                }
                if (poll.right!=null) {
                    queue.offer(poll.right);
                }
                if (revse) {
                    list.add(poll.val);
                }else{
                    list.add(0,poll.val);
                }
            }
            revse = !revse;
            listList.add(list);
        }
        return listList;
    }
}
