package com.zhuanti.tanxin;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 给定多个区间，计算让这些区间互不重叠所需要移除区间的最少个数。起止相连不算重叠
 */
public class _435_EraseOverlapIntervals {
    public int eraseOverlapIntervals(int [][] intervals){
        if (intervals.length==0){
            return 0;
        }
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        int total = 0;
        int prev = intervals[0][1];
        for (int i = 0; i < n; i++) {
            if (intervals[i][0] < prev){
                total++;
            }else {
                prev = intervals[i][1];
            }
        }
        return total;
    }
}
