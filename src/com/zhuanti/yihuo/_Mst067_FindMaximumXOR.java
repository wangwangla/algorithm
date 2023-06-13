package com.zhuanti.yihuo;

/**
 * 给你一个整数数组 nums ，返回 nums[i] XOR nums[j] 的最大运算结果，其中 0 ≤ i ≤ j < n 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [3,10,5,25,2,8]
 * 输出：28
 * 解释：最大运算结果是 5 XOR 25 = 28.
 * 示例 2：
 *
 * 输入：nums = [14,70,53,83,49,91,36,80,92,51,66,70]
 * 输出：127
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 2 * 105
 * 0 <= nums[i] <= 231 - 1
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/ms70jA
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _Mst067_FindMaximumXOR {
    public int findMaximumXOR(int[] nums) {

        return 0;
    }

    /**
     * 异或的最大值    他们1 和 0的值  不相同的最多
     *
     * 同为0  不同为1
     * @param args
     */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 11;
        int num3 = num1 ^ num2;
        System.out.println(num3);
    }
}
