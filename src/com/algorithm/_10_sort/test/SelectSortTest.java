package com.algorithm._10_sort.test;

import com.algorithm._10_sort._5_select.SelectSort;

import java.util.Arrays;

public class SelectSortTest {
    public static void main(String[] args) {
        Integer arr[] = {2,3,9,5,4,7};
        SelectSort.sort(arr);
        System.out.printf("打印数组："+ Arrays.toString(arr));
    }
}
