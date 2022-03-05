package com.let;

public class CountEven {
    public int countEven(int num) {
        int index = 0;
        for(int i = 2; i <= num ;i+=2){
            System.out.println(i);
            index ++;
        }
        return index;
    }

    public static void main(String[] args) {
        CountEven e = new CountEven();
//        e.countEven(30);
        for (int i = 0; i < 15; i++) {
            int v = e.v(i);
            if (v != -1) {
                System.out.println(v);
            }
        }
    }

    public int v(int num){
        int sum = 0;
        while (num!=0){
            sum += num % 10;
            num = num / 10;
        }
        return sum%2==0?sum:-1;
    }
}
