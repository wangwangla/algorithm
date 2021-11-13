package com.algorithm.digui;

/**
 * 8皇后的代码还是比较简单的
 * 1、第一行就0开始
 * 2.第二行从0开始
 * ……
 * 次数 8x8x8x8x8x8x8x8
 */
public class EightHuanghou {
    public static void main(String[] args) {
        EightHuanghou huanghou = new EightHuanghou();
        huanghou.check(0);
    }

    private void check(int n) {
        if (n == max){
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            array[n] = i;
            //如果不型就直接放弃
            if (judge(n)){
                check(n+1);
            }
        }
    }

    private boolean judge(int n) {
        judgeCount++;
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n] - array[i])){
                return false;
            }
        }
        return true;
    }

    private void print() {
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    int max = 4;
    int []array = new int[max];
    static int count = 0;
    static int judgeCount = 0;
}
