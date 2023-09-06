package com.zhuanti.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Example 1:
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 *
 * Example 2:
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]]
 * Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 */
public class _57_insert {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ansList = new ArrayList<int[]>();
        int start = 0;
        //未到达new数组之前的部分
        for (int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (newInterval[0]<=interval[1]){
                start = i;
                break;
            }else {
                ansList.add(new int[]{interval[0],interval[1]});
            }
        }
        int left  = Math.min(intervals[start][0],newInterval[0]);
        //判定中间的部分
        if (start == intervals.length-1){
            ansList.add(new int[]{left, Math.max(intervals[start][1], newInterval[1])});
            System.out.println(left+"    "+Math.max(intervals[start][1], newInterval[1]));
            start++;
        }else {
            for (int i = start; i < intervals.length; i++) {
                int i1 = newInterval[1];
                if (intervals[i][0] > i1) {
                    ansList.add(new int[]{left, Math.max(intervals[i - 1][1], i1)});
                    start = i;
                    break;
                }
            }
        }
        //最后面的一部分
        for (int i = start; i < intervals.length; i++) {
            System.out.println(intervals[i][0]+"    "+intervals[i][1]);
        }
        return null;
    }


    public int[][] insert1(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int left = 0;
        int right = 0;
        for (int[] interval : intervals) {
            if (left==0) {
                if (interval[1] > newInterval[0]) {
                    left = Math.min(interval[0], newInterval[0]);
                    right = Math.max(interval[1], newInterval[1]);
                }
            }else {
                if (interval[0] > newInterval[1]) {
//                    System.out.println(left + newInterval[1]);
//                    right = newInterval[1];
//                } else {
                    right = Math.max(interval[1], newInterval[1]);
                }
            }
        }
        System.out.println(left + "  " +right);
        return null;
    }
    public static void main(String[] args) {
//        int [][]intervals = {{1,3},{6,9}};
//        int newInterval[] = {2,5};

//        int intervals[][] = {{1,2}, {3,5},{6,7},{8,10},{12,16}};
//        int []newInterval = {4,8};
        int intervals[][] = {{1,5},{3,10}};
        int newInterval[] = {2,7};
        _57_insert insert = new _57_insert();
        insert.insert1(intervals,newInterval);
//        输出：[[1,5],[6,9]]
    }
}
