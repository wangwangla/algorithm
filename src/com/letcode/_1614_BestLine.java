package com.letcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 给定一个二维平面及平面上的 N 个点列表Points，其中第i个点的坐标为Points[i]=[Xi,Yi]。请找出一条直线，其通过的点的数目最多。
 *
 * 设穿过最多点的直线所穿过的全部点编号从小到大排序的列表为S，你仅需返回[S[0],S[1]]作为答案，若有多条直线穿过了相同数量的点，则选择S[0]值较小的直线返回，S[0]相同则选择S[1]值较小的直线返回。
 *
 * 示例：
 *
 * 输入： [[0,0],[1,1],[1,0],[2,0]]
 * 输出： [0,2]
 * 解释： 所求直线穿过的3个点的编号为[0,2,3]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/best-line-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _1614_BestLine {
    public int[] bestLine(int[][] points) {
        int countMax = 0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<points.length;i++) {
            int max = points.length - i - 1;
            int x0 = points[i][0];
            int y0 = points[i][1];
            double[] listO = new double[max];
            for (int j = i + 1; j < points.length; j++) {
                int x1 = points[j][0];
                int y1 = points[j][1];
                listO[j - i - 1] = x1 == x0 ? Double.MAX_VALUE : 1.0 * (y1 - y0) / (x1 - x0);
            }
            double[] list = new double[max];
            for (int j = 0; j < max; j++)
                list[j] = listO[j];
            Arrays.sort(list);
            double cur = list[0];
            double curMax = 0;
            int curCount = 1;
            boolean flag = false;
            for (int j = 0; j < list.length; j++) {
                if (Math.abs(list[j] - cur) < 0.000001)
                    curCount++;
                else {
                    if (curCount > countMax) {
                        flag = true;
                        countMax = curCount;
                        curMax = cur;
                    }
                    cur = list[j];
                    curCount = 2;
                }
                if (j == list.length - 1 && curCount > countMax) {
                    flag = true;
                    countMax = curCount;
                    curMax = cur;
                }
            }
            if (flag) {
                arr.clear();
                arr.add(i);
                for (int j = i + 1; j < points.length; j++) {
                    if (Math.abs(listO[j - i - 1] - curMax) < 0.000001)
                        arr.add(j);
                }
            }
            if(arr.size()>=max-1){
                return new int[]{arr.get(0),arr.get(1)};
            }
        }
        return new int[]{arr.get(0),arr.get(1)};
    }
}

