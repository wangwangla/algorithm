package com.zhuanti.binaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class _117_connect {
    public Node connect(Node root) {
        if (root == null)return root;
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while (queue.size()>0){
            int size = queue.size();
            Node pre = null;
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if (poll.left!=null){
                    queue.offer(poll.left);
                }
                if (poll.right!=null){
                    queue.offer(poll.right);
                }
                if (pre == null){
                    pre = poll;
                }else {
                    pre.next = poll;
                }
                System.out.print(poll.val);
            }
            System.out.println();
        }
        return root;
    }
}
