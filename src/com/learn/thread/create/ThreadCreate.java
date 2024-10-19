package com.learn.thread.create;

public class ThreadCreate {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("创建方式一");
            }
        }.start();
    }
}
