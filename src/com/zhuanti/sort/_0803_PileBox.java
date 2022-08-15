package com.zhuanti.sort;

import java.util.Arrays;
import java.util.Comparator;

public class _0803_PileBox {
    public int pileBox(int[][] box) {
        Arrays.sort(box, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        //使用dp求出最大值
        for (int[] ints : box) {

        }
        return 0;
    }

    public int xx(int[][] box){
        int n = box.length;
        Arrays.sort(box, (a, b) -> a[0] - b[0]);
        int[] f = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (box[i][0] > box[j][0] && box[i][1] > box[j][1] && box[i][2] > box[j][2]) {
                    f[i] = Math.max(f[j] + box[i][2], f[i]);
                }
            }
            if (f[i] == 0) f[i] = box[i][2];
            res = Math.max(f[i], res);
        }
        return res;
    }
}
