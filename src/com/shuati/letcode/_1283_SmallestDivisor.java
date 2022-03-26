package com.shuati.letcode;

/**
 * 使用二分
 * - 找出最大值，也就是除数的最大值
 * - 向上取值  所以最大除数为最大值到顶了
 *
 * 二分查找
 *
 * 如果大于 thr
 *   left  变大
 *
 * 如果小于 thr
 *   right  减小
 *
 * 这个可以理解为寻找上界和下届
 */
public class _1283_SmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        // 先找数组中的最大值，用最大值作为除数，除完以后和最小
        int maxVal = 1;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }

        // 注意：最小值是 1，因为 threshold 可以很大
        int left = 1;
        int right = maxVal;

        while (left < right) {
            int mid = (left + right) >>> 1;
            if (calculateSum(nums, mid) > threshold) {
                // sum 大于阈值一定不是解，说明除数选得太小了
                // 下一轮搜索区间是 [mid + 1, right]
                // （把下一轮搜索区间写出来，边界选择就不会错）
                left = mid + 1;
                // 边界是 left = mid + 1 ，中间数不用上取整
            } else {
                right = mid;
            }
        }
        return left;
    }

    /**
     * @param nums
     * @param divisor
     * @return 数组中各个元素与 divisor 相除的结果（向上取整）之和
     */
    private int calculateSum(int[] nums, int divisor) {
        int sum = 0;

        for (int num : nums) {
            sum += num / divisor;
            // 注意：不能整除的时候，需要向上取整
            if (num % divisor != 0) {
                sum++;
            }
        }
        return sum;
    }
}
