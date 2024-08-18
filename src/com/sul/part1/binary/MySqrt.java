package com.sul.part1.binary;

/**
 * 示例 1：
 *
 * 输入：x = 4
 * 输出：2
 * 示例 2：
 *
 * 输入：x = 8
 * 输出：2
 * 解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
 */
public class MySqrt {
    public int mySqrt(int x) {
        if(x ==1 )return 1;
        int i = x / 2;
        for (int i1 = 1; i1 < x; i1++) {
            long i2 = i1 * i1;
            if (i2 > x){
                return i1-1;
            }else if(i2 == x){
                return i1 ;
            }else if(i2 <= 0 ){
                return i1-1;
            }
        }
        return i;
    }



    public static void main(String[] args) {
        MySqrt mySqrt = new MySqrt();
        System.out.println(mySqrt.mySqrt(2147395600));
    }
}
