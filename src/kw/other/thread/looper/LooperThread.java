package kw.other.thread.looper;

public class LooperThread extends Thread{
    @Override
    public void run() {
        Looper.prepare();

        Looper.loop();
    }

    public static void main(String[] args) {
        new LooperThread().start();
    }
}
