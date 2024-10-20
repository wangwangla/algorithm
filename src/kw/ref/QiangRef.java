package kw.ref;

public class QiangRef {
    /**
     * 强引用
     * @param args
     */
    public static void main(String[] args) {
        String ref = new String("xx");
        System.out.println(ref);
        System.gc();
        System.out.println(ref);
    }
}
