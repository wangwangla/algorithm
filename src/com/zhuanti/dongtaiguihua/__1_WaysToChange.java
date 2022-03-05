package com.zhuanti.dongtaiguihua;

/**
 * 爬楼梯    第一次爬1 和  第3次  爬1 是不同的效果
 *
 *
 * 找零钱最后给的是找零的  存在重复
 *
 *
 * 完全背包
 */
public class __1_WaysToChange {
    static final int MOD = 1000000007;
    int[] coins = {25, 10, 5, 1};
    public int waysToChange(int n) {
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int c = 0; c < 4; ++c) {
            int coin = coins[c];
            for (int i = coin; i <= n; ++i) {
                f[i] = (f[i] + f[i - coin]) % MOD;
            }
        }
        return f[n];
    }
//
//    public int waysToChange1(int n) {
//        int[] f = new int[n + 1];
//        f[0] = 1;
//        for (int i = 0; i < n; i++) {
//            for (int coin : coins) {
//                if (coin>i)continue;
//                f[i] = (f[i] + f[i - coin]);
//            }
//        }
//        return f[n];
//    }

    public int waysToChange2(int n) {
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int coin : coins) {
            for (int i = 1; i < n; i++) {
                if (coin>i)continue;
                f[i] = f[i] + f[i - coin];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int coin : coins) {
                if (coin>i)continue;
                f[i] = (f[i] + f[i - coin]);
            }
        }
        return f[n];
    }

    public int waysToChange3(int n) {
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i < n; i++) {
                if (coin>i)continue;
                f[i] = f[i] + f[i - coin];
            }
        }
        return f[n];
    }
}
