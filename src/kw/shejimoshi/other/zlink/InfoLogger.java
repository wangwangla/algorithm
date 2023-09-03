package kw.shejimoshi.other.zlink;

public class InfoLogger extends AbstractLogger{
    public InfoLogger(){
        level = 1;
    }
    @Override
    public void log() {
        System.out.println();
    }
}
