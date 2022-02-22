package com.labuladong._1_chapterone;

import com.algorithm._3_queue.QueueLink;
import com.zhuanti.binaryTree.TreeNode;
import com.algorithm._5_graph.Graph;
import com.zhuanti.linklist.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
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

    /**
     * 解开密码的次数
     */
    String plusOne(String s,int j){
        char[] ch = s.toCharArray();
        if (ch[j] == '9'){
            ch[j] = '0';
        }else {
            ch[j] += 1;
        }
        return new String(ch);
    }

    String minusOne(String s,int j){
        char[] ch = s.toCharArray();
        if (ch[j] == '0'){
            ch[j] = '9';
        }else {
            ch[j] -= 1;
        }
        return new String(ch);
    }

    void sol(String target,String[]deadsaee){
        Set<String> deads = new HashSet<>();
        for (int i = 0; i < deadsaee.length; i++) {
            deads.add(deadsaee[i]);
        }
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer("0000");
        visited.add("0000");
        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String cur = q.poll();
                System.out.println(cur);
                if (deads.contains(cur))continue;
                if (cur.equals(target))return;
                for (int i1 = 0; i1 < cur.length(); i1++) {
                    String up = plusOne(cur,i1);
                    if (!visited.contains(up)){
                        q.offer(up);
                        visited.add(up);
                    }
                    String down = minusOne(cur,i1);
                    if (!visited.contains(down)){
                        q.offer(down);
                        visited.add(down);
                    }
                }
            }
        }
    }

    /**
     * 使用数组或者队列进行存储，每次一层一层进行遍历，如果是二叉树，不需要存储已经访问过的节点，
     * 如果不是二叉树，是图，就需要进行记录，防止出现环
     *
     * @param start
     * @param terget
     * @return
     */
    public int BFS1(Node start,Node terget){

        return 0;
    }

    /**
     * 可以一岑一层的遍历  如果左右都为null，那么就已经到了结尾了
     * @param node
     * @return
     */
    public int minTreeHight(Node node){
        return 0;
    }
}
