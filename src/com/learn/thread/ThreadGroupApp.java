package com.learn.thread;

/**
 * 知道就行
 */
public class ThreadGroupApp {
    public static void main(String[] args) throws InterruptedException {
        //所属线程组
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        System.out.println(threadGroup.getName());

        //线程组的父类
        System.out.println(threadGroup.getParent().getName());

        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getThreadGroup().getName());
            System.out.println("创建出线程，默认与当前线程同组");
        });
        t1.start();

        Thread.sleep(1000);
    }
}
