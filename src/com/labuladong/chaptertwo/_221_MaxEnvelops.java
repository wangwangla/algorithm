package com.labuladong.chaptertwo;

import java.util.Arrays;
import java.util.Comparator;

public class _221_MaxEnvelops {
    int maxEnvelops(int[][] envelops){
//        保证一边可以放入
//        保证另一边也可以放入   得到一个数组。
//        将二维数组，变为一维数组求解
        Arrays.sort(envelops, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int i = o1[0] - o2[0];
                if (i == 0){
                    return o2[1] - o1[1];
                }
                return i;
            }
        });
        int dp[] = new int[envelops.length];
        for (int i = 0; i < envelops.length; i++) {
            dp[i] = 1;
            for (int i1 = 0; i1 < i; i1++) {
                if (envelops[i][1] > envelops[i1][1]){
                    dp[i] = Math.max(dp[i],dp[i1] + 1);
                }
            }
        }
        return 0;
    }
}
