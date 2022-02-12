package com.algorithm._5_graph;

import com.algorithm._3_queue.QueueLink;

public class BFS {
    private QueueLink<Integer> queue;
    private boolean []marked;
    private int count;
    
    BFS(Graph g,int v){
        queue = new QueueLink<>();
        marked = new boolean[g.getVerTexNum()];
        count = 0;
    }
    
    public void bfs(Graph graph,int v){
        marked[v] = true;
        queue.enqueue(v);
        while (!queue.idEmpty()){
            int wait = queue.dequeue();
            QueueLink<Integer> findQueue = graph.getVer(wait);
            for (Integer integer : findQueue) {
                if (!marked[integer]){
                    bfs(graph,integer);
                }
            }
        }
        count++;
    }

    /**
     * 广度
     */
//    先第一i个顶点进行 遍历
//    进入队列
//    遍历之后设置已经遍历
//    在出队列，再次进行
    public void xx(Graph g,int v){
        marked[v] = true;
        queue.enqueue(v);
        while (!queue.idEmpty()){
            int wait = queue.dequeue();
//            出一个在遍历
        }
    }
}
