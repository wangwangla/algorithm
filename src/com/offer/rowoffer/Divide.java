package com.offer.rowoffer;

public class Divide {
    public int divide(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int count = b;
        int num = 1;
        while (a>count){
            num += num;
            count += count;
        }
        System.out.println("--------"+num);
        return 0;
    }

    public static void main(String[] args) {
        Divide divide = new Divide();
        divide.divide(7,-3);
    }
}
