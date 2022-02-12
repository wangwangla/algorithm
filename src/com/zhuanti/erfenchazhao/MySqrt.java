package com.zhuanti.erfenchazhao;

/**
 * 69
 * 二分找出第一个数字平方小于x的值
 */
public class MySqrt {
    public int mySqrt(int x) {
        int low = 0;
        int end = x;
        int mid = 0;
        while (low <= end) {
            mid = (low + end) / 2;
            int i = mid * mid;
            if(i == x)return mid;
            if (mid * mid < x) {
                low = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        MySqrt sqrt = new MySqrt();
        System.out.println(sqrt.mySqrt(9));
    }
}
