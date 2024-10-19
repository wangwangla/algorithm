package kw.bit;

public class TableSize {
    public static void main(String[] args) {
        tableSizeFor(4);
        tableSizeFor(54);

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
