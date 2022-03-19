package com.grindcode._9_Math;

public class _504_ConvertBase {
    public static String convertBase(int num,int convert){
        int a = 0;
        int b = 0;
        String ans = "";
        boolean isN = false;
        if (num<0){
            isN = true;
        }
        num = Math.abs(num);
        while (num > 0){
            a = num / convert;
            b = num % convert;
            ans = b+""+ans;
            num = a;
        }
        return isN ?"-" + ans:ans;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 16; i++) {
            System.out.println(i+"  进制  "+convertBase(10,i));
        }
    }
}
