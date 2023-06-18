package kw.java.dyn;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.f(4);
    }

    public void f(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        System.out.println("1 ---> "+dp[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            System.out.println(i+"----->"+dp[i]);
        }
    }
}
