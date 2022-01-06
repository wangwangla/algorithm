package com.zhuanti.erfenchazhao;

/**
 * 69
 * 二分找出第一个数字平方小于x的值
 */
public class MySqrt {
    public int mySqrt(int x) {
        int low = 0;
        int end = x/2;
        int mid = 0;
        int ans = 0;
        while (low <= end) {
            mid = (low + end) / 2;
            if ((long)mid * mid <= x) {
                ans = mid;
                low += 1;
            } else {
                end -= 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        MySqrt sqrt = new MySqrt();
        System.out.println(sqrt.mySqrt(9));
    }
}
