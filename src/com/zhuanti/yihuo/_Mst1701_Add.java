package com.zhuanti.yihuo;

public class _Mst1701_Add {
    public int add(int a, int b) {
        return a + b;
    }

    public int add1(int a, int b) {
        //进位
        while (b!=0) {
            int i = (a & b) << 1;
            a = a ^ b;
            b = i;
        }
        return a;
    }
//1 1
    public static void main(String[] args) {
        //进位
        _Mst1701_Add add = new _Mst1701_Add();
        System.out.println(add.add(2, 4));
    }

}
