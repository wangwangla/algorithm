package com.algorithm._5_graph;

import com.algorithm._3_queue.QueueLink;

public class DFS {
    //标记图的结点
    private boolean[] marked;
    //一共有多少是相通的。
    private int count;
    DFS(Graph g,int s){
        //标记当前点是不是已经找过了
        this.marked = new boolean[g.getVerTexNum()];
        count = 0;
    }

    public void dfs(Graph g,int s){
        //当前点
        marked[s] = true;
        for (int i = g.getVer(s).size() - 1; i >= 0; i--) {
            if (!marked[i]){
                dfs(g, g.getVer(s).dequeue());
            }
        }
        System.out.println();
    }

    /**
     * 深度变量的原理
     * 图 的存储，一个数组队列
     * 数据加入到队列中，
     */
    public void dfs1(Graph g,int s){
        QueueLink<Integer> ver = g.getVer(s);
        marked[s] = true;
        for (int i = 0; i < ver.size(); i++) {
            if (!marked[i])
                dfs(g,ver.dequeue());
        }
    }
}
