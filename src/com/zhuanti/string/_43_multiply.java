package com.zhuanti.string;

public class _43_multiply {
    public String multiply(String num1, String num2) {
        char[] chars = num1.toCharArray();
        char[] chars1 = num2.toCharArray();
        int c = 0;
        for (int i = 0; i < chars.length; i++) {
            int a = Integer.valueOf(chars[i]-'0');
            for (int i1 = 0; i1 < chars1.length; i1++) {
                int b = Integer.valueOf(chars1[chars1.length - 1 - i1]-'0');
                int i2 = a * b;
                i2 = i2 + c;
                c = 0;
                if (i2 >= 10){
                    c = 1;
                    i2 = i2 - 10;
                }
                System.out.print(i2 +"   ");
                if (i1==0&&c>0){
                    System.out.print(c+"    ");
                    c = 0;
                }
            }
            System.out.println();
        }
        return null;
    }

    public static void main(String[] args) {
        _43_multiply multiply = new _43_multiply();
        multiply.multiply("123","456");
    }
}
