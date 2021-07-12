package com.digui;

public class Digui {
    public static void main(String[] args) {
        Digui digui = new Digui();
        arr = new int[11];
        digui.fanbi2(10);
        System.out.println(digui.num);
    }

    public static int arr[] ;
//  案例
    public int fanbi(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fanbi(n - 1) + fanbi(n-2);
    }

    /**
     * 递归的优化
     */
    public int num = 0;
    public void fanbi2(int n){
        num ++;
        if (n == 1 || n == 2){
            arr[n] = 1;
            return;
        }
        if (arr[n-1]==0)
        fanbi2(n-1);
        if (arr[n-2]==0)
        fanbi2(n-2);
        arr[n] = arr[n-1] + arr[n-2];
    }
}
