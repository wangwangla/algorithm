package com.zhuanti.array;

import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {
//        int [][]intervals = {{1,3},{6,9}};
//        int newInterval[] = {2,5};

//        int intervals[][] = {{1,2}, {3,5},{6,7},{8,10},{12,16}};
//        int []newInterval = {4,8};
        int intervals[][] = {{1,5}};
        int newInterval[] = {2,7};
        _57_insert insert = new _57_insert();
        insert.insert(intervals,newInterval);
//        输出：[[1,5],[6,9]]
    }
}
