package com.labuladong.chapterone;

import com.algorithm.Queue;
import com.algorithm.binaryTree.TreeNode;
import com.algorithm.graph.Graph;

/**
 * 可以解决什么问题？？
 * 1.求最短距离
 * * 迷宫
 * * 连连看
 * * 替换字母变为另一个
 */
public class _141_BFS {
    private Queue<Integer> queue;
    private boolean []marked;
    private int count;

    private Queue<TreeNode> queu = new Queue<>();

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
            Queue<Integer> findQueue = graph.getVer(wait);
//            if (findQueue.size()==0)return;
            for (Integer integer : findQueue) {
                if (!marked[integer]){
                    bfs(graph,integer);
                }
            }
        }
        count++;
    }

}
