package com.offer;

/**
 * @author:28188
 * @date: 2021/4/18
 * @time: 14:39
 */
public class Question13 {
    /**
     * n长度的绳子，所以可以分为n+1段
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        //长度为2的时候  值为1
        //长度如果为3的时候   可以使用
        for(int i = 3; i < n + 1; i++){
            for(int j = 2; j < i; j++){

                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }

    public int cutt(int n){
        int dp[] = new int[n+1];
        dp[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            for (int i1 = 2; i1 < i; i1++) {
                dp[i] = Math.max(dp[i],Math.max(i1*(i-i1),i1*dp[i-i1]));
            }
        }
        return 0;
    }

    public int cuttingRope2(int n) {
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;
        long res = 1;
        while(n > 4){
            res *= 3;
//            res = res % 1000000007;
            System.out.println(res);
            n -= 3;
        }
        return (int)(res * n % 1000000007);
    }

    public static void main(String[] args) {
        Question13 question13 = new Question13();
        question13.cuttingRope2(120);
    }
}
