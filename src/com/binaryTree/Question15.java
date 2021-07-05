package com.binaryTree;

import com.queue.Queue;

/**
 * @author:28188
 * @date: 2021/7/4
 * @time: 7:19
 */
public class Question15 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        if (root==null || root.left == null) {
            return root;
        }
        root.left.next = root.right;
        if (root.next != null){
            root.right.next  = root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }

    //广度遍历   一次将数据全部遍历了
//  遍历所有

    public void bfs(Node root){
        Queue<Node> queue = new Queue<>();
        queue.enqueue(root);
        while (!queue.idEmpty()){
//            Node dequeue = queue.dequeue();

            Node temp = null;
            for (int i = 0; i < queue.size(); i++) {
                Node dequeue = queue.dequeue();
                if (temp == null){
                    temp = dequeue;
                }else {
                    temp.next = dequeue;
                    dequeue = temp;
                }
                System.out.println(dequeue.val);
                if (dequeue.left!=null) {
                    queue.enqueue(dequeue.left);
                }
                if (dequeue.right!=null){
                    queue.enqueue(dequeue.right);
                }
            }
        }
    }
}
