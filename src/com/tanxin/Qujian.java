package com.tanxin;

import java.util.Arrays;

/**
 * intvs=[[1,3],[2,4],[3,6]]，这些区间最多有两个区间互不相交，
 * 即[[1,3],[3,6]]，你的算法应该返回 2。注意边界相同并不算相交。
 */
public class Qujian {
    /**
     * 将结尾排序
     * 1.使用贪心，找出最早结束
     * 2.下一个可以执行的任务
     * 3.下下一个
     * ……
     */
    public void soulation(int start[],int end[]){
        //排序
        Arrays.sort(end);
        //取出第一个
        int endNum = end[0];
        int count = 0;
        for (int i1 : start) {
            if (i1>=endNum){
                count ++;
                endNum = i1;
            }
        }
        System.out.println(count);
    }

    //找到可以移除的区间
    //至少需要用多少支🗡可以吧气球炸完
}
