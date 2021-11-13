package com.algorithm.chazhao.fbnq;

/**
 * 斐波那契查找
 * 一个线段分为两个部分  一部分 / 总  == 另一部分 / 这一部分  == 0.618；
 *
 * 斐波那契相邻两个数是无线接近的。
 *
 * 1 1 2 3 5 8
 * 举例：
 * 2  3
 * 2 / 3 = 0.6666
 * 3 / 5 = 0.6
 *
 * 5  8
 * 5 / 8 = 0.6
 * 8 / 13 = 0.6
 *
 * 中间不在取mid。而是取斐波那契
 *
 * f(k) = f(k-1) + f(k-2)\
 * f(k) - 1 = f(k-1) -1 + f(k - 2) - 1  + 1
 *
 * mid = low + f(k - 1) - 1
 * */
public class FbnqSearch {
    public static void main(String[] args) {

    }
    public int[] fib(int maxSize){
        int[] f = new int[maxSize];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < maxSize; i++) {
            f[i] = f[i-1] + f[i - 2];
        }
        return f;
    }

    public int fibSearch(int []a,int key){
        int low = 0;
        int hight = a.length - 1;
        int k = 0;
        int mid = 0;
        int [] f = fib(a.length);
        while (hight > f[k] - 1){
            k++;
        }
    }
}
