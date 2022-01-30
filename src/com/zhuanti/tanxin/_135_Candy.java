package com.zhuanti.tanxin;

import java.util.Arrays;

/**
 * 一群孩子站成一排，每一个孩子有自己的评分。现在需要给这些孩子发糖果，规则是如果一
 * 个孩子的评分比自己身旁的一个孩子要高，那么这个孩子就必须得到比身旁孩子更多的糖果；所
 * 有孩子至少要有一个糖果。求解最少需要多少个糖果。
 *
 *
 */
public class _135_Candy {
    public int candy(int arr[]){
//        Arrays.sort(arr);
        int num = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[i-1]){
                num++;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[arr.length - i]>arr[arr.length - i - 1]){
                num++;
            }
        }
        return num;
    }
}
