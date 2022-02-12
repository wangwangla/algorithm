package com.chengxujingsai;

import com.algorithm._3_queue.QueueLink;

public class QueueDemo {
    public static void main(String[] args) {
        QueueLink<Integer> queue = new QueueLink<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
    }
}
