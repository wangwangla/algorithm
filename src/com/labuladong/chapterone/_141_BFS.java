package com.labuladong.chapterone;

import com.algorithm._3_queue.QueueLink;
import com.algorithm.binaryTree.TreeNode;
import com.algorithm._5_graph.Graph;
import com.test.hanshunping.lianbiao.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * 可以解决什么问题？？
 * 1.求最短距离
 * * 迷宫
 * * 连连看
 * * 替换字母变为另一个
 */
public class _141_BFS {
    private QueueLink<Integer> queue;
    private boolean []marked;
    private int count;

    private QueueLink<TreeNode> queu = new QueueLink<>();

    public void bfs(TreeNode root, int v){
        queu.enqueue(root);
        int num = 0;
        while (!queu.idEmpty()){
            int size = queu.size();
            for (int i = 0; i < size; i++) {
                TreeNode wait = queu.dequeue();
                if (wait.left == null && wait.right ==null){
                    System.out.println(num);//最小
                    return;
                }
                queu.enqueue(wait.left);
                queu.enqueue(wait.right);
            }
            num++;
        }
        count++;
    }


    public void bfs(Graph graph, int v){
        marked[v] = true;
        queue.enqueue(v);
        while (!queue.idEmpty()){
            int wait = queue.dequeue();
            QueueLink<Integer> findQueue = graph.getVer(wait);
//            if (findQueue.size()==0)return;
            for (Integer integer : findQueue) {
                if (!marked[integer]){
                    bfs(graph,integer);
                }
            }
        }
        count++;
    }

    int BFS(Node start,Node target){
        QueueLink<Node> q = new QueueLink<>();
        Set<Node> visited = new HashSet<Node>();
        q.enqueue(start);
        visited.add(target);
        int step = 0;

        while (q.idEmpty()){
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                Node cur = q.dequeue();
                if (cur == target){
                    return 1;
                }
            }
        }
        return 0;
    }

    public int minDepth(TreeNode root){
        if (root == null)return 0;
        QueueLink<TreeNode> queue = new QueueLink<>();
        queue.enqueue(root);
        int depth = 1;
        while (!queue.idEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.dequeue();
                if (cur.left == null && cur.right == null){
                    return depth;
                }
                if (cur.left != null){
                    queue.enqueue(cur.left);
                }
                if (cur.right != null){
                    queue.enqueue(cur.right);
                }
            }
            depth++;
        }
        return depth;
    }


}
