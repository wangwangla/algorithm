package com.offer;

import java.sql.Struct;

/**
 * @author:28188
 * @date: 2021/4/14
 * @time: 8:27
 *
 * 剑指 Offer 11. 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 *
 * 示例 1：
 *
 * 输入：[3,4,5,1,2]
 * 输出：1
 * 示例 2：
 *
 * 输入：[2,2,2,0,1]
 * 输出：0
 *
 * 解题思路：
 *  旋转数组
 *  a.取出第一个数据 ，找到他要放的位置
 *  1 2 3 4 5 6
 *  1 -> 2
 *  2 -> 3
 *  3 -> 4
 *
 *
 *  这种写法 ，可以解决不是循环的  比如一直执行0 2 4 6 0 2 4 6.，对于错位的是没有关系的
 */
public class Question09 {
    public int minArray(int[] numbers) {
        //先找出最小的坐标
        int min = Integer.MAX_VALUE;
        int index = 0;
        int xx = 0;
        for (int number : numbers) {
            if (min > number) {
                xx = index;
                min = number;
            }
            index++;
        }
        xx = numbers.length - xx;
        int i = 0;  //第一个开始
        int num = numbers[i];
        int temp = numbers[i];
        boolean b= false;
        int len = numbers.length;
        if (xx == numbers.length/2){
            b = true;
            len /= 2;
        }
        for (int i1 = 0; i1 < len ; i1++) {
            num = temp;
            int i2 = (i + xx) % numbers.length;
            temp = numbers[i2];
            numbers[i2] = num;
            i=i2;
        }

        return 0;
    }

    public static void main(String[] args) {
//        int [] arr  = {6,7,8,1,2,3,4,5};
        int [] arr = {3,3,1,3};
        Question09 question09 = new Question09();
        question09.minArray(arr);
    }
}
