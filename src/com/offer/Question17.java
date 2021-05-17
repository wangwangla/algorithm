package com.offer;

/**
 * @author:28188
 * @date: 2021/4/19
 * @time: 6:58
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 *
 *
 *
 * 示例：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 *
 *
 * 提示：
 *
 * 0 <= nums.length <= 50000
 * 1 <= nums[i] <= 10000
 *
 *
 * 思路： 双指针
 * 开头指针   结尾指针
 * 开头遇到偶数停下    结尾遇到奇数停下
 * 指针相同的时候停下
 *
 *
 * 快慢指针
 *
 * 同时出发，第一个指针遇到不符合的 时候停下，然后另一个进行走，遇到可以进行交换的时停下，然后二者进行交换
 */
public class Question17 {
}
