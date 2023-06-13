package com.grindcode._3_doublepoint;

public class _633_JudgeSquareSum {
    public boolean judgeSquareSum(int c) {
            long sqrt = (int)Math.sqrt(c);
            long left = 0;
            long right = sqrt;
            while (left<=right){

                long v = left * left + right * right;
                System.out.println(v);
                if (v == c) {
                    return true;
                }else if (v < c){
                    left ++;
                }else {
                    right --;
                }
            }
            return false;

    }

    public static void main(String[] args) {
        _633_JudgeSquareSum judgeSquareSum = new _633_JudgeSquareSum();
        System.out.println(judgeSquareSum.judgeSquareSum(2147483600));
    }
}
