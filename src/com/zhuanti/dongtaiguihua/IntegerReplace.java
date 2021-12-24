package com.zhuanti.dongtaiguihua;

import java.util.HashMap;

/**
 *给定一个正整数 n ，你可以做如下操作：
 *
 * 如果 n 是偶数，则用 n / 2替换 n 。
 * 如果 n 是奇数，则可以用 n + 1或n - 1替换 n 。
 * n 变为 1 所需的最小替换次数是多少？
 *
 */
public class IntegerReplace {
    public int integerReplacement(int n) {
        if (n == 1){
            return 1;
        }
        if (n%2 == 0){
             return 1 + integerReplacement(n / 2);
        }
        return 2 + Math.min(integerReplacement(n/2),integerReplacement(n/2)+1);
    }

    public int integerReplacement1(int n) {
//        arr = new int[n+1];
        return xx(n);

    }

    HashMap<Integer,Integer> hashMap = new HashMap<>();
//    int arr[] ;

    public int xx(int n){
        if (n == 1){
            return 0;
        }
        if (hashMap.containsKey(n)) {
            System.out.println("hashMap.get(n):" + hashMap.get(n));
            return hashMap.get(n);
        }
        if (n%2 == 0){
            hashMap.put(n,1+xx(n/2));
            return hashMap.get(n);
        }
        int xx1 = xx((n + 1) / 2);
        int xx2 = xx((n - 1) / 2);
        hashMap.put(n,2 + Math.min(xx1, xx2));
        return hashMap.get(n);
    }

    public static void main(String[] args) {
        IntegerReplace r = new IntegerReplace();
        r.integerReplacement(2147483647);
        System.out.println("-----------------------");

        System.out.println(Math.log(8));
    }

}
