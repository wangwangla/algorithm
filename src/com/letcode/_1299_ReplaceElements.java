package com.letcode;

import java.util.Stack;

/**
 * 给你⼀个数组 arr ，请你将每个元素⽤它右边最⼤的元素替换，如果是最后⼀个元素，⽤ -1 替换。完成
 * 所有替换操作后，请你返回这个数组。
 */
public class _1299_ReplaceElements {
    public int[] replaceElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[arr.length - 1 - i];
            if (stack.isEmpty()) {
                arr[arr.length-1-i] = -1;
            }else {
                arr[arr.length - 1 - i] = stack.firstElement();
                while (!stack.isEmpty()&&stack.peek()<i1){
                    stack.pop();
                }
            }
            stack.push(i1);
        }
        return arr;
    }

    public int[] replaceElements1(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[arr.length - 1 - i];
            if (max == Integer.MAX_VALUE) {
                arr[arr.length-1-i] = -1;
            }else {
                arr[arr.length - 1 - i] = max;
//                while (!stack.isEmpty()&&stack.peek()<i1){
//                    stack.pop();
//                }
                if (max<i1){
                    max = i1;
                }
            }
        }
        return arr;
    }
}
