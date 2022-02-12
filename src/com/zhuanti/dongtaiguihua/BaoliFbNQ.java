package com.zhuanti.dongtaiguihua;

public class BaoliFbNQ {
    public int fib(int n){
        if (n == 0)return 0;
        if (n ==1 || n==2)return 1;
        else {
            return fib(n-1) + fib(n-2);
        }
    }

//   上面存在重复问题   使用备忘的方式进行解决   使用自顶向下的方式进行优化
//

    public int fib1(int arr[],int n){
        if (n == 0)return 0;
        if (n ==1 || n==2){
            arr[1] = 1;
            arr[2] = 1;
            return 1;
        }
        if (arr[n]!=0){
            return arr[n];
        }
        else {
            arr[n] = fib1(arr,n-1) + fib1(arr,n-2);
            return arr[n];
        }
    }
//    动态规划使用的是自下向上的方式。
    public int fib2(int n){
        if (n==0)return 0;
        if (n==1 || n==2){
            return 1;
        }
        int dp[] = new int[n+1];
        dp[1] = dp[2] = 1;
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
