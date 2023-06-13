package com.letcode;

public class _56_Merge {
    public int[][] merge(int[][] intervals) {
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if(end >= intervals[i][0]){
                end = Math.max(intervals[i][0],end);
            }else {
                System.out.println(start+"  "+end);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        System.out.println(start+"  "+end);
        return null;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        _56_Merge merge = new _56_Merge();
        merge.merge(arr);
    }
}
