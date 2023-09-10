package kw.time;

public class Time {
    public static void main(String[] args) {
        long time = 1000;
        long l = time / 1000; //秒


        tableSizeFor(1 << 30);

    }

    static final void tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        System.out.println(n);
    }
}
