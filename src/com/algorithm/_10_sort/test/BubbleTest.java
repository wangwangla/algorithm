package com.algorithm._10_sort.test;

import com.algorithm._10_sort._1_bubble.Bubble;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer arr[] = {3,4,2,6,8};
        //这里是通用的，需要实现了comparable的类，所以使用包装类
        Bubble.sort(arr);
        System.out.printf("打印数组："+ Arrays.toString(arr));
    }
}
