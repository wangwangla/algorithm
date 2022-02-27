package com.letcode;

import java.util.ArrayList;

public class _1281_subtractProductAndSum {
    public int subtractProductAndSum(int n) {
        ArrayList<Integer> x = x(n);
        int add = 0;
        int mul = 0;
        for (Integer integer : x) {
            add += integer;
            mul *= integer;
        }
        return mul - add;
    }

    public ArrayList<Integer> x(int n){
        ArrayList<Integer> arrayList = new ArrayList();
        while (n!=0){
            arrayList.add(n % 10);
            n /= 10;
        }
        return arrayList;
    }

    public static void main(String[] args) {
        _1281_subtractProductAndSum sum = new _1281_subtractProductAndSum();
        sum.subtractProductAndSum(10);
    }
}
