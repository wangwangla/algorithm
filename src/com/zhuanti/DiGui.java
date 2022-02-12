package com.zhuanti;

public class DiGui {
    public static void main(String[] args) {

    }

    /**
     * 阶乘
     */
    int fact(int n){
        if (n == 0)return 1;
        return n * fact(n-1);
    }

    /**
     * 斐波那契
     */
    int fib(int n){
        if (n <= 1) return n;
        return fib(n-1)+fact(n-2);
    }

    /**
     * 优化 使用空间  节约时间
     */
    private int arr[];
    public int fib1(int n){
        if (n != 0) {
            if (arr[n] != 0) return arr[n];
        }
        if (n <= 1)return n;
        return fib1(n-1) + fib1(n-2);
    }

    /**
     * 优化2
     * @param n
     * @return
     */
//    public int fib2(int n){
//        if (n != 0) {
//            if (arr[n] != 0) return arr[n];
//        }
//        if (n <= 1)return n;
//        return fib2(n-1) + fib2(n-2);
//    }
//

}



















