package com.zhuanti.array;

/**
 * 给你一个 无重叠的 ，按照区间起始端点排序的区间列表。
 *
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 *
 * 输入：intervals = [[1,3],[6,9]], newInterval = [2,5]
 * 输出：[[1,5],[6,9]]
 */
public class Demo01 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0];
        int end = newInterval[1];
        int xx = 0;
        for (int[] interval : intervals) {
            int i = interval[1];
            if (i<=start){
                System.out.println(interval[0]+"  "+interval[1]);
            }else if (end<interval[0]){
                System.out.println(interval[0]+"    "+interval[1]);
            }else {
                if (start>interval[0]){
                    xx = interval[0];
                }
                if (end<interval[1]){
                    System.out.println(xx+"  "+end);
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        int arr[][] = {
                {1,3},
                {6,9}
        };
        int aa [] = {
                2,5
        };
        demo01.insert(arr,aa);
    }
}
