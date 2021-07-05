package com.binaryTree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author:28188
 * @date: 2021/7/4
 * @time: 16:01
 */
public class Question17 {
    private TreeNode cur;
    private Deque<TreeNode> stack;

    public Question17(TreeNode root) {
        cur = root;
        stack = new LinkedList<>();
    }

    public int next() {
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        cur = stack.pop();
        int ret = cur.val;
        cur = cur.right;
        return ret;
    }

    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }
}
