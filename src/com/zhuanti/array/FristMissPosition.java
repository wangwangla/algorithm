package com.zhuanti.array;

import java.util.Stack;

/**
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 *
 * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
 */
public class FristMissPosition {
    public static void main(String[] args) {
         int arr[] = {1,2,0};
         FristMissPosition position = new FristMissPosition();
         position.firstMissingPositive1(arr);
    }

    /**
     * 错误
     * @param nums
     * @return
     */
    public int firstMissingPositive(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) {
                while (!stack.isEmpty() && stack.peek() > nums[i]){
                    stack.pop();
                }
                stack.push(i);
            }
        }
        if (stack.isEmpty()){
            return 0;
        }else {
            Integer pop = stack.pop();
            if (pop == 0){
                return 0;
            }else {
                return pop -1;
            }
        }
    }

    /**
     * 最小值
     *
     * 1.for  找出正数    找出最小数字
     * 如果最小的值大于1，那么就直接返回1
     * 但是如果小于等于1，那么存在两种情况：
     * （1）在中间
     * （2）在末尾
     *
     */
    public int firstMissingPositive1(int[] nums) {
        int min = Integer.MAX_VALUE;
        int countZZ = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=0){
                countZZ++;
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
        }

        int aa[] = new int[countZZ];
        if (min >1){
            return 1;
        }else {
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                if (num >= 0) {
                    int i1 = num - min;
                    if (i1 < countZZ) {
                        aa[i1] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < aa.length; i++) {
            if (aa[i] == 0){
                return i+min;
            }
        }
        return min+countZZ+1;
    }


}
