package com.zhuanti.breathfristsearch;

import com.zhuanti.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        if (root!=null){
            deque.add(root);
        }
        List<Integer> list = new ArrayList<>();
        while (!deque.isEmpty()){
            int size1 = deque.size();
            for (int i = 0; i < size1; i++) {
                TreeNode poll = deque.poll();
                if (i==0)list.add(poll.val);

                if (poll.right != null) {
                    deque.add(poll.right);
                }
                if (poll.left != null) {
                    deque.add(poll.left);
                }
            }
        }
        return list;
    }
}
