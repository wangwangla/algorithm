package com.offer;

import java.util.Arrays;

/**
 * @author:28188
 * @date: 2021/5/7
 * @time: 7:18
 *
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 * 示例 1：
 *
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 *
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 *
 * 找出最小的k个数字
 *
 * 执行用时：
 * 8 ms
 * , 在所有 Java 提交中击败了
 * 67.53%
 * 的用户
 * 内存消耗：
 * 39.7 MB
 * , 在所有 Java 提交中击败了
 * 63.43%
 * 的用户
 */
public class Question23 {
    //排序  然后取出k个值
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
//        for (int i : arr) {
//            System.out.println(i);
//        }
        int arrr [] = new int[k];
        for (int i = 0; i < arr.length; i++) {
            arrr[i] = arr[i];
        }
        return arrr;
    }

    //方法二： 使用桶将数字装入桶中，在桶中数数


//    方法三   

    public static void main(String[] args) {
        int arr[] = {
                2,7,3,4,9
        };
        Question23 question23 = new Question23();
        question23.getLeastNumbers(arr,4);
    }
}
