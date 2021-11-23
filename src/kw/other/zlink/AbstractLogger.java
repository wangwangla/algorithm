package kw.other.zlink;

public abstract class AbstractLogger {
    protected int level = 0;
    private AbstractLogger next;
    public abstract void log();

    public void showLog(int level){
        if (this.level>level){
            log();
        }
        if (next!=null){
            next.showLog(level);
        }
    }

    public void nextLogger(AbstractLogger abstractLogger){
        next = abstractLogger;
    }
}
