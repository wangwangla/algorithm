package com.zhuanti.dongtaiguihua;

/**
 * 题目：给N个物品，重量分别为A0,A1,A2……，一个背包最大的称重为M,最多可以带走多重的物品
 *
 *
 *
 * 例子：
 *
 * 输入4个物品，2，3，5，7.最大承重为10
 *
 * 输出10  2 3 5
 *
 *
 * 和最接近的钱解法一样 完全背包问题
 */
public class wanquanbeibao {
    public int method(int target ,int arr[]){
        int n = arr.length;
        //没有物品就为0
        if (n == 0){
            return 0;
        }
        //取第i个物品的时候，可以组成那几个值
        boolean f[][] = new boolean[n+1][target+1];
        f[0][0] =  true;
        //取0个是不会达到要求的
        for (int i = 1; i <= target; i++) {
            f[0][i] = false;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                f[i][j] = f[i-1][j];
                if (j >= arr[i-1]){
                    f[i][j] = f[i][j] || f[i-1][j-arr[i-1]];
                }
            }
        }
        for (int i = target; i >= 0; i++) {
            if (f[n][i]){
                return i;
            }
        }
        return 0;
    }

    public static int method1(int target ,int arr[]){
        //使用0 1背包
        int n = arr.length;
        int f [][] = new int[arr.length+1][target+1];
        //初始化
        //取第i个物品
        for (int i = 0; i < arr.length+1; i++) {
            //背包的重量  从最小 开始遍历
            for (int j = 0; j <= target; j++) {
                //0个物品使用的时候为0   背包重量为0的时候为0
                if (i == 0||j==0){
                    f[i][j] = 0;//不取的时候为0
                }else {
                    //如果背包重量小于当重量的时候，我们使用上次的值
                    if (j<arr[i-1]){
                        f[i][j] = f[i-1][j];
                    }else {
                        //如果大于，我们就找出，本次拿与不拿的重量最大值
                        f[i][j] = Math.max(f[i-1][j],f[i-1][j-arr[i-1]]+arr[i-1]);
                    }
                }
            }
        }

        return 0;
    }

    public static void method3(int arr[],int target){
        int length = arr.length;
        // 个数  目标
        boolean dp[][] = new boolean[length][target];
        dp[0][0] = true;
        for (int i = 1; i < target; i++) {
            dp[0][i] = false;  //开始为0  取0个是无法满足要求的
        }

        for (int i = 1; i < length; i++) {
            for (int i1 = 0; i1 < target; i1++) {
                if (i1>arr[i]){
                    dp[i][i1] = dp[i][i1] || dp[i][i1 - arr[i-1]];
                }
            }
        }
    }

    public static void mm(int arr[],int target){
        int num = arr.length;
        int dp[][] = new int[num][target];
        for (int i = 0; i < num; i++) {
            for (int i1 = 0; i1 < target; i1++) {
                if (i == 0||i1 == 0){
                    dp[i][i1] = 0;//取0的时候为0
                }else {
                    if (i1<arr[i]){
                        dp[i][i1] = dp[i-1][i1];
                    }else {
                        //我们要拿
                        dp[i][i1] = Math.max(dp[i - 1][i1], dp[i - 1][i1 - arr[i1 - 1]] + arr[i1 - 1]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
//        int arr[] = {2,3,5,7};
        //价值
        int arr[] = {1,2,3,3,7};
        int target = 7;
        method1(target,arr);
    }
}
