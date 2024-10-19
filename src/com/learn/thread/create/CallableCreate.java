package com.learn.thread.create;

import java.util.concurrent.*;

/**
 * Callable可以创建线程，但是不能直接传递给thread使用，需要进行一次封装
 * 使用FutureTask,将FutureTask传递给Thread，最后通过futureTask给Thread，
 * 并且可以拿到返回值。
 */
public class CallableCreate {
    public static void main(String[] args) {
        CallTask task = new CallTask();
        //对象不能直接作为thread逻辑
        FutureTask<String> futureTask = new FutureTask(task);
        new Thread(futureTask).start();
        try{
            System.out.println("进入");
            String result = futureTask.get();
            System.out.println(result);
        }catch (ExecutionException | InterruptedException e){
            e.printStackTrace();
        }
    }
}

class CallTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "callable";
    }
}