package com.letcode;

public class _7_NumReverse {
    public int reverse(int x){
        int srcNum = x;
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < 32; i++) {
//            int i1 = x >> 1 & 1;
//            x = x>>1;
//            result.append(i1);
//        }
//        System.out.println(Integer.parseInt(result.toString(), 2));
        int res = 0;
        x = Math.abs(x);
        while (x>0){
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return srcNum<0 ? -res : res    ;
    }

    public void revserNum(int num){
        int res = 0;
        num = Math.abs(num);
        while (num > 0){
            res = res * 10 + num % 10;
            num = num / 10;
        }
        return;
    }

    public static void main(String[] args) {
        _7_NumReverse reverse = new _7_NumReverse();
        System.out.println(reverse.reverse(-998));
    }
}
