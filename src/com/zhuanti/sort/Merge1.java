package com.zhuanti.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 以数组 intervals 表示若干个区间的集合，
 * 其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，
 * 并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-intervals
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Merge1 {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end){
                end = Math.max(intervals[i][1],end);
            }else {
//                save
                ans.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        //save 最后一个
        ans.add(new int[]{start,end});
        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < res.length; i++){
            res[i] = ans.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int [][] arr = {{1,2},{3,6},{8,10},{15,18}};
        Merge1 merge = new Merge1();
        merge.merge(arr);
    }
}
