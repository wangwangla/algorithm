package kw.thread;

public class App {
    private static int i = 0;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (i==0){
                }

                System.out.println("thread exit!");
            }
        }).start();
        i = 1;
        System.out.println("main exit!");
    }
}
