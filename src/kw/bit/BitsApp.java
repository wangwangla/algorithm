package kw.bit;

public class BitsApp {
    public static void main(String[] args) {
        byte[] b = new byte[4];
        Bits.putInt(b,0,1000);
        int anInt = Bits.getInt(b, 0);
        System.out.println(anInt);

        System.out.println(Math.toRadians(90));
        System.out.println(Math.toDegrees(1.57));
        System.out.println(Math.sin(Math.toRadians(90)));

        System.out.println(Math.asin(1.0));

    }
}
