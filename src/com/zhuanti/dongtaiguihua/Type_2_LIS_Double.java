package com.zhuanti.dongtaiguihua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 信封嵌套问题
 */
public class Type_2_LIS_Double {
    public int maxEnvelops(int[][] envelops){
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

        int h[] = new int[envelops.length];
        for (int i = 0; i < envelops.length; i++) {
            h[i] = envelops[i][1];
        }
        return new Type_1_LIS().lengthOfLIS(h);
//        for (int i = 0; i < envelops.length; i++) {
//            for (int i1 = 0; i1 < i; i1++) {
//                if (envelops[i][0] > envelops[i1][0]){
////                    ke
//                }else if (envelops[i][0] == envelops[i1][0]){
////
//                    if (envelops[i1][1]<envelops[i][0]){
////                        ke
//                    }
//                }
//            }
//        }
    }
}
