package com.zhuanti.array;

import com.zhuanti.binaryTree._124_maxPathSum;

/**
 * 下一个排列
 * - 从后向前找出一个降序
 * - 在执行一次，找出一个比当前降序的大的，交换，在逆序
 */
public class _31_NextPermutation {
    public void nextPermutation(int[] nums) {
        //从后向前找逆序  降序
        //最后一位是否达成两位交换，可以是的数值更大
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        //找到降序  在找比当前值大的移动到这里，然后将后面的逆序。
        if (i >= 0) {
            //从后向前找出比逆序小的一个
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            //交换一下
            swap(nums, i, j);
        }
        //逆序
        reverse(nums, i + 1);

        for (int num : nums) {
            System.out.println(num);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        _31_NextPermutation nextPermutation = new _31_NextPermutation();
//        nextPermutation.nextPermutation(new int[]{1,2,3,4,5});
        nextPermutation.nextPermutation(new int[]{1,2,3,5,4});
    }
}
