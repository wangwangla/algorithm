package com.zhuanti.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;


/**
 *
 * 435. 无重叠区间
 *
 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。

 注意:

 可以认为区间的终点总是大于它的起点。
 区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
 示例 1:

 输入: [ [1,2], [2,3], [3,4], [1,3] ]

 输出: 1

 解释: 移除 [1,3] 后，剩下的区间没有重叠。
 */
public class EraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int pos = intervals[0][1];
        int ans = 1;
        for (int[] balloon: intervals) {
            if (balloon[0] >= pos) {
                ++ans;
                pos = balloon[1];
            }
        }
        return intervals.length - ans;
    }
}
