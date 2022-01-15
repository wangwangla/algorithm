package kw.learn.thread.stopthread;

public class StopThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {

            private int i;
            private int j;

            @Override
            public void run() {
                synchronized (this){
                    i++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    j++;
                }
            }
        });
        thread.start();
        thread.stop();
    }
}
