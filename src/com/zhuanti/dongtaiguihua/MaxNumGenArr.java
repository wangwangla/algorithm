package com.zhuanti.dongtaiguihua;

/**
 * 给你一个整数 n 。按下述规则生成一个长度为 n + 1 的数组 nums ：
 *
 * nums[0] = 0
 * nums[1] = 1
 * 当 2 <= 2 * i <= n 时，nums[2 * i] = nums[i]
 * 当 2 <= 2 * i + 1 <= n 时，nums[2 * i + 1] = nums[i] + nums[i + 1]
 * 返回生成数组 nums 中的 最大 值。
 */
public class MaxNumGenArr {
    public int getMaximumGenerated(int n) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        int max = 0;
//        for (int i = 1; i <= n / 2; i++) {
//            dp[2*i] = dp[i];
//            System.out.println(2*i);
//        }
//
//        for (int i = 1; i <= (n - 1)/2; i++) {
//            System.out.println(2*i+1);
//            dp[2*i+1] = dp[i] + dp[i+1];
//        }
//        System.out.println("----------------------------");
//        for (int i : dp) {
//            if (i>max){
//                max = i;
//            }
//        }
        for (int i = 0; i < dp.length; i++) {
//            dp[i] = dp[]
        }

        return max;
    }

    public static void main(String[] args) {
        MaxNumGenArr arr = new MaxNumGenArr();
        arr.getMaximumGenerated(7);
    }
}
