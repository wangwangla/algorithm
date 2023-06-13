package com.letcode;

public class _367_isPerfectSquare {
    //数值太大的时候不适用
    public boolean isPerfectSquare(int num) {
        int i = num / 2;
        if (num == 1)return true;

        for (int i1 = 0; i1 < i; i1++) {
            int i2 = (i - i1) * (i - i1);
            if (i2 == num){
                return true;
            }else if (i2<num){
                return false;
            }
        }
        return false;
    }

    //二分法

    public static void main(String[] args) {
        _367_isPerfectSquare square = new _367_isPerfectSquare();
        square.isPerfectSquare(9);
    }
}
