package com.zhuanti.doublepoint;

import java.util.Arrays;

/**
 *
 * 执行结果：
 * 通过
 * 显示详情
 * 添加备注
 *
 * 执行用时：
 * 612 ms
 * , 在所有 Java 提交中击败了
 * 5.00%
 * 的用户
 * 内存消耗：
 * 43.9 MB
 * , 在所有 Java 提交中击败了
 * 5.03%
 * 的用户
 * 通过测试用例：
 * 137 / 137
 */
public class _977_SortedSquares {
    public int[] sortedSquares(int[] nums) {
        if (nums.length==0)return nums;
        nums[0] = nums[0] * nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
            for (int i1 = 0; i1 < i; i1++) {
                if (nums[i-i1]<nums[i-i1-1]){
                    int temp = nums[i-i1-1];
                    nums[i-i1-1] = nums[i-i1];
                    nums[i-i1] = temp;
                }
            }
        }
        return nums;
    }


    /**
     * 执行结果：
     * 通过
     * 显示详情
     * 添加备注
     *
     * 执行用时：
     * 4 ms
     * , 在所有 Java 提交中击败了
     * 31.23%
     * 的用户
     * 内存消耗：
     * 43.1 MB
     * , 在所有 Java 提交中击败了
     * 59.58%
     * 的用户
     * 通过测试用例：
     * 137 / 137
     * @param nums
     * @return
     */
    public int[] sortedSquares1(int[] nums) {
        if (nums.length==0)return nums;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);

        return nums;
    }


    public static void main(String[] args) {
        _977_SortedSquares sortedSquares = new _977_SortedSquares();
        sortedSquares.sortedSquares(new int[]{-51,2,3,4,5});
    }
}
