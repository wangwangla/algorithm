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

    /**
     * 宽高比下面的大   可以放几层
     * @param box
     * @return
     */
    public int xx(int[][] box){
        int n = box.length;
        Arrays.sort(box, (a, b) -> a[0] - b[0]);
        int[] f = new int[n];
        int res = 0;

        //前面的加上当前的  是不是可以变的更大
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


    public int xxx(int [][] box){
        Arrays.sort(box, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int dp[] = new int[box.length];
        int res  = 0;
        for (int r = 0; r < box.length; r++) {
            dp[r] = 1;
            for (int i = r-1; i >= 0 ; i--) {
                if (box[r][1]>box[i][1]){
                    dp[r] = Math.max(dp[i]+1,dp[r]);
                }
            }
            res = Math.max(res,dp[r]);
        }
        return res;
    }

    /**
     * 之前遇到的是 套盒子
     */

    public void inn(int box[][]){
        Arrays.sort(box, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]){
                    return o2[1] - o1[2];
                }else
                    return o1[1] - o2[1];
            }
        });
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        _0803_PileBox pileBox = new _0803_PileBox();
        pileBox.inn(new int[][]{{2,2},{2,5},{2,1},{5,4}});
    }
}
