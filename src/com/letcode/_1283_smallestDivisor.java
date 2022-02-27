package com.letcode;

/**
 * 给你一个整数数组 nums 和一个正整数 threshold  ，你需要选择一个正整数作为除数，然后将数组里每个数都除以它，并对除法结果求和。
 *
 * 请你找出能够使上述结果小于等于阈值 threshold 的除数中 最小 的那个。
 *
 * 每个数除以除数后都向上取整，比方说 7/3 = 3 ， 10/2 = 5 。
 *
 * 题目保证一定有解。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-smallest-divisor-given-a-threshold
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 在数组中选一个数字，作为除数，然后除法求和，和小于threshold.
 */
public class _1283_smallestDivisor {
    public static int smallestDivisor(int[] nums, int threshold) {
        int min = Integer.MAX_VALUE;
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int count = 0;
            for (int num : nums) {
                count += Math.ceil(num*1.0F / num1);
            }
            if(count<=threshold){
                if (num1<min){
                    res = i;
                    min = num1;
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {44,22,33,11,1};
        System.out.println(smallestDivisor(arr, 5));
    }
}
