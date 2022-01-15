package com.zhuanti.sort;

import java.util.Arrays;
import java.util.Comparator;

/*
建议全文背诵
添加备注

执行用时：
51 ms
, 在所有 Java 提交中击败了
93.85%
的用户
内存消耗：
40.7 MB
, 在所有 Java 提交中击败了
55.90%
的用户
通过测试用例：
43 / 43
炫耀一下:
 */
public class BestSeqAtIndex {
    public int bestSeqAtIndex(int[] height, int[] weight) {
        int length = height.length;
        int length1 = weight.length;
        int arr[][] = new int[length][2];
        for (int i = 0; i < height.length; i++) {
            arr[i][0] = height[i];
            arr[i][1] = weight[i];
        }
        int n = arr.length;
        // 按宽度升序排列，如果宽度一样，则按高度降序排列
        Arrays.sort(arr, new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b) {
                return a[0] == b[0] ?
                        b[1] - a[1] : a[0] - b[0];
            }
        });
        // 对高度数组寻找 LIS
        int l = 1;
        int[] height1 = new int[n];
        for (int i = 0; i < n-1; i++)
            if (height[i]>height[i+1]) {
                l++;
            }
        System.out.println("_-------------------");

        return l;
    }

    public static void main(String[] args) {
        int []height = {1,2,3,4};
        int []weight = {4,3,2,1};
//        int []height = {65,70,56,75,60,68};
//        int []weight = {100,150,90,190,95,110};
        BestSeqAtIndex index = new BestSeqAtIndex();
        index.maxEnvelopes(height,weight);
    }


    /*
     * @param envelopes: a number of envelopes with widths and heights
     * @return: the maximum number of envelopes
     */
    public int maxEnvelopes(int[] height, int[] weight) {
        // write your code here

        int length = height.length;
        int length1 = weight.length;
        int envelopes[][] = new int[length][2];
        for (int i = 0; i < height.length; i++) {
            envelopes[i][0] = height[i];
            envelopes[i][1] = weight[i];
        }
        // 先对信封进行按照第一个参数升序 第二个参数降序的方式进行排序
        Arrays.sort(envelopes, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0]) {
                    return b[1] - a[1];
                } else {
                    return a[0] - b[0];
                }
            }
        });
        //初始化dp数组，cnt表示dp数组长度
        //令 dp[i]=minwidth 表示长度为i的上升子序列的结尾的元素的width最小是为minwidth
        //len 表示使用的dp数组长度
        int dp[] = new int[envelopes.length];
        int len = 0;
        for(int i = 0; i < envelopes.length; i++) {
        /*
        1、如果找到关键字，则返回值为关键字在数组中的位置索引，且索引从0开始
        2、如果没有找到关键字，返回值为负的插入点值，
        所谓插入点值就是第一个比关键字大的元素在数组中的位置索引
        而且这个位置索引从1开始。
        */
            int index = Arrays.binarySearch(dp, 0, len, envelopes[i][1]);
            if(index < 0) {
                index = -index - 1;
            }
            dp[index] = envelopes[i][1];
            if (index == len) {
                len++;
            }
        }
        return len;
    }
}
