package com.zhuanti.array;

import java.util.Arrays;
import java.util.Comparator;

public class TaoXinFeng {
    public static void main(String[] args) {

    }

    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length == 0){
            return 0;
        }

        int n = envelopes.length;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]!=o2[0]){
                    return o1[0] - o2[2];
                }else {
                    return o1[1] - o2[1];
                }
            }
        });
        int []f = new int[n];
        int ans = 1;
        for (int i = 0; i < n; i++) {
            f[i] = 1;
            for (int i1 = 0; i1 < i; i1++) {
                if (envelopes[i1][1] < envelopes[i][1]){
                    f[i] = Math.max(f[i],f[i1]+1);
                }
            }
            ans = Math.max(ans,f[i]);
        }
        return ans;
    }


    public int maxEnvelopes1(int[][] envelopes) {
        if (envelopes.length == 0){
            return 0;
        }

        int n = envelopes.length;
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[2];
                }
                return 0;
            }
        });
        int []f = new int[n];
        int ans = 1;
        for (int i = 0; i < n; i++) {
            f[i] = 1;
            for (int i1 = 0; i1 < i; i1++) {


                //判断  w h


                if (envelopes[i1][1] < envelopes[i][1]){
                    f[i] = Math.max(f[i],f[i1]+1);
                }
            }
            ans = Math.max(ans,f[i]);
        }
        return ans;
    }


}
