package com.algorithm._10_sort._5_select;

import com.algorithm._10_sort.father.SortAbstr;

/**
 * 选择排序
 * 1.选择第一个值，一次向后，每次找出一个最值，将最值与第一个值交换
 *
 * 时间复杂度：
 * （1）n-1  n-2 ……
 * （2）n - 1 ……
 * （3）交换n
 * 空间复杂度  o(1)
 */
public class SelectSort extends SortAbstr {
    public static void sort(Comparable[] a) {
        int min = Integer.MIN_VALUE;
        //最后一个数据了，就不需要在比较了，所以是length-1
        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            //第一次从1开始，下来是2……
            for (int j = 1 + i; j < a.length; j++) {
                if (greater(a[min], a[j])) {
                    min = j;
                }
            }
            //如果数据没有变化，就不要浪费资源了
            if (min != i) {
                exch(a, i, min);
            }
        }
    }

    //   将最小下标和当前比较的下标进行一次交换
    public static void selectSort(Comparable[] a) {
        int min = 0;
        for (int i = 0; i < a.length-1; i++) {
            min = i;
            for (int i1 = i+1; i1 < a.length; i1++) {
                if (greater(a[min],a[i1])){
                    min = i1;
                }
            }
            if (min!=1){
                exch(a,i,min);
            }
        }
    }

    public static void main(String[] args) {
        Comparable arr[] = {
                1,7,82,3,4,56,6
        };
        SelectSort sort = new SelectSort();
        sort.selectSort(arr);
        System.out.println("------------------------------");
    }
}