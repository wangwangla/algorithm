package com.learn.thread.nt.App;

public class AppThread {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        // 线程A
        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    try {
                        System.out.println("线程A等待通知...");
                        lock.wait(); // 等待线程B的通知
                        System.out.println("线程A收到通知，继续执行！");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

        // 线程B
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000); // 模拟一些工作，延迟1秒
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock) {
                    System.out.println("线程B准备通知线程A...");
                    lock.notify(); // 通知线程A
                    System.out.println("线程B已经发出通知！");
                }
            }
        }).start();
    }
}
