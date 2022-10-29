package com.algorithmessentials;

/**
 * 实现下一个排列，将数字按字典顺序重新排列为下一个更大的数字排列。
 *
 * 如果这样的排列是不可能的，它必须重新排列为最低可能的顺序(即，按升序排序)。
 *
 * 更换必须到位，不要分配额外的内存。
 *
 * 这里有一些例子。输入在左列，相应的输出在右列。
 *
 *
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 *
 *
 * 字典序
 */
public class _6_NextPermutation {
    public void nextPermutation(int nums[]){
        nextPermutation(nums, 0, nums.length);
    }

    private static boolean nextPermutation(int[] nums, int begin, int end) {
        // From right to left, find the first digit(partitionNumber)
        // which violates the increase trend
        int p = end - 2;
        while (p > -1 && nums[p] >= nums[p + 1]) --p;
        // If not found, which means current sequence is already the largest
        // permutation, then rearrange to the first permutation and return false
        if(p == -1) {
            reverse(nums, begin, end);
            return false;
        }
        // From right to left, find the first digit which is greater
        // than the partition number, call it changeNumber
        int c = end - 1;
        while (c > 0 && nums[c] <= nums[p]) --c;
        // Swap the partitionNumber and changeNumber
        swap(nums, p, c);
        // Reverse all the digits on the right of partitionNumber
        reverse(nums, p+1, end);
        return true;
    }
    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    private static void reverse(int[] nums, int begin, int end) {
        end--;
        while (begin < end) {
            swap(nums, begin++, end--);
        }
    }
}
