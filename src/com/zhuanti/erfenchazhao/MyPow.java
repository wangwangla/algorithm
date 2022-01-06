package com.zhuanti.erfenchazhao;

public class MyPow {
    public double myPow(double x, int n) {
        int res = 0;
        for (int i = n; i != 0; i/=2) {
            if (i % 2 != 0){
                res *= x;
            }
            x *= x;
        }
        return n<0?1/res:res;
    }
}
