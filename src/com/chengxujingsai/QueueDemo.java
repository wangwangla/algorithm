package com.chengxujingsai;

import com.algorithm.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
    }
}
