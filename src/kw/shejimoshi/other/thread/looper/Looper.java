package kw.shejimoshi.other.thread.looper;

public class Looper {
    private MesageQueue mQueue;
    private boolean mRun;
    private Thread mThread;
    private Looper(){
        mQueue = new MesageQueue();
        mRun = true;
        mThread = Thread.currentThread();
    }
    private static final ThreadLocal<Looper> sThreadLocal = new ThreadLocal();
    public static void prepare() {
        if (sThreadLocal.get() == null){
            sThreadLocal.set(new Looper());
        }
    }

    public void add(){
//        mQueue.
    }

    public static void loop() {
        Looper me = myLoop();
        MesageQueue mQueue = me.mQueue;
        while (true){
            Message next = mQueue.next();
            if (next!=null){
                if (next.target!=null){
                    next.target.dispatchMessage(next);
                }
            }
        }
    }

    private static Looper myLoop(){
        return sThreadLocal.get();
    }
}
