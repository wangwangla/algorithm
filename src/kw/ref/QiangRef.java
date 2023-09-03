package kw.ref;

public class QiangRef {
    /**
     * 强引用
     * @param args
     */
    public static void main(String[] args) {
        String ref = new String("xx");
        String str1 = ref;
        System.out.println(ref == str1);
    }
}
