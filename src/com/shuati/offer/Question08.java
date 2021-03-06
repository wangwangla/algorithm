package com.shuati.offer;

/**
 * @author:28188
 * @date: 2021/4/14
 * @time: 8:18
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：2
 * 示例 2：
 *
 * 输入：n = 7
 * 输出：21
 * 示例 3：
 *
 * 输入：n = 0
 * 输出：1
 * 提示：
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 动态规划
 *  跳跃到某个台阶存在多少中方式
 *  维护一个数组，记录每一个位置的操作步骤，直到最后一个
 *
 *  f[0] = 1;
 *  f[1] = 1;
 *  f[2] = 2;  1  1 2
 *  f[3] = 3   1 1 1    2 1   1 2
 *
 *  f[4] f[2]有几种方式   f[3]有几种方式   f[2] 跳1就是f[3]   f[3]只能跳1
 */
public class Question08 {
}
