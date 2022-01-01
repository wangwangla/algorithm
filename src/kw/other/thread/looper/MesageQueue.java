package kw.other.thread.looper;

import java.util.concurrent.LinkedBlockingQueue;

public class MesageQueue {
    private LinkedBlockingQueue<Message> queue;
    public MesageQueue(){
        queue = new LinkedBlockingQueue();
    }

    public void add(){
        queue.add(new Message());
    }

    public Message next(){
        return queue.poll();
    }
}
