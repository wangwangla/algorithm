package com.zhuanti.binaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class _102_levelOrder {
    private List<List<Integer>> listList = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)return listList;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int size = queue.size();
        while (queue.size()>0) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
                list.add(poll.val);
            }
            listList.add(list);
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        _102_levelOrder levelOrder = new _102_levelOrder();
        levelOrder.levelOrder(node);

    }
}
