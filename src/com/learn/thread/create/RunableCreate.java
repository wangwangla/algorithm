package com.learn.thread.create;

/**
 * runnable只是一种业务逻辑
 */
public class RunableCreate {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        thread.start();
    }
}
