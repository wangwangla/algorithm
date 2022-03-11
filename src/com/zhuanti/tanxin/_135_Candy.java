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
    /**
     *
     */
    public static int candy(int ratings[]){
        int n = ratings.length;
        int[] left = new int[n];
        //初始化为1   比左边大  那么就+1
        for (int i = 0; i < n; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        for (int i = 0; i < n-1; i++) {
            if (ratings[n- 1 - i]<ratings[n-2-i]){
                left[n-2-i] = Math.max(left[n-2-i],left[n-1-i]+1);
            }
        }
        //右边向左边
//        int right = 0, ret = 0;
//        for (int i = n - 1; i >= 0; i--) {
//            if (i < n - 1 && ratings[i] > ratings[i + 1]) {
//                right++;
//            } else {
//                right = 1;
//            }
//            ret += Math.max(left[i], right);
//        }
        int ret = 0;
        for (int i = 0; i < left.length; i++) {
            ret += left[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2};
        System.out.println(candy(arr));
    }
}
