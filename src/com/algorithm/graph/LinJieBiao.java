package com.algorithm.graph;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinJieBiao {
    private LinkedBlockingQueue queue[];
    private int verTexNum;
    private int lineNum;

    private LinJieBiao(int num) {
        this.verTexNum = num;
        queue = new LinkedBlockingQueue[num];
        for (int i = 0; i < num; i++) {
            queue[i] = new LinkedBlockingQueue(10);
        }
    }

    public void add(int v,int w){
        queue[v].add(w);
        queue[w].add(v);
    }

    public static void main(String[] args) {
        LinJieBiao biao = new LinJieBiao(10);
        LinkedBlockingQueue[] queue = biao.queue;
        biao.add(1,2);
        biao.add(1,3);
        biao.add(1,4);
        biao.add(1,5);
        biao.add(1,7);
        biao.add(1,6);
        biao.print(biao);


    }

    public void print(LinJieBiao biao){
        LinkedBlockingQueue[] queue = biao.queue;
        for (int i = 0; i < queue.length; i++) {
            LinkedBlockingQueue linkedBlockingQueue = queue[i];
            for (int i1 = 0; i1 < linkedBlockingQueue.size(); i1++) {
                System.out.println(linkedBlockingQueue.poll());
            }
        }
    }

}
