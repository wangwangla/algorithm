package com.shuati.letcode;

/**
 * @author:28188
 * @date: 2021/5/16
 * @time: 14:59
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
 *
 *
 * 优化方式：
 *  使用扩大2倍的方式，然后再慢慢缩小范围
 */
public class Divide {
    public static int divide(int dividend, int divisor) {
        boolean isZheng = true;
        if (divisor == 0)return 0;
        if (dividend == 0)return 0;
        if (dividend<0)isZheng = !isZheng;
        if (divisor<0)isZheng = !isZheng;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int lastNum = 0;
        for (int i = 0; i < 100; i++) {
            if (lastNum<=dividend){
                lastNum = divisor * (i + 1);
                if (lastNum>dividend){
                    if (isZheng){
                        return i;
                    }else {
                        return -i;

                    }
                }else if (lastNum == dividend){
                    if (isZheng){
                        return i+1;
                    }else {
                        return -(i+1);

                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(divide(7, -3));
    }
}
