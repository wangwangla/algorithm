package kw.lang;

public class IntegerDemo {
    public static void main(String[] args) {
//        System.out.println(Integer.toString(10, 2));
//        System.out.println(Integer.toUnsignedString(10, 2));

        int a = 10000;
        byte xx = (byte) (1000);
        System.out.println(xx);
        System.out.println(a >>> 8);
        System.out.println(a >>> 16);
        System.out.println(a >>> 24);

        System.out.println(16 & 0xff);
        System.out.println((39)<<8 & 0xff);

    }
}
