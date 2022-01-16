package com.zhuanti.erfenchazhao;

import com.algorithm.binaryTree.TreeNode;

import java.util.HashSet;

/**
 *
 * 167
 *
 *
 * 给定一个已按照 非递减顺序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 *
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 *
 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end){
            int i = numbers[start] + numbers[end];
            if (i == target)break;
            if (i > target){
                end--;
            }else {
                start ++;
            }
        }
        return new int[]{start,end};
    }

    public boolean findTarget(TreeNode root, int target) {
        if (root == null)return false;
        return find(root,target,new HashSet<Integer>());
    }

    private boolean find(TreeNode root, int target,HashSet<Integer> hashSet) {
        if (root == null)return false;
        if (hashSet.contains(target - root.val))return true;
        hashSet.add(root.val);
        return find(root.left,target,hashSet) || find(root.right,target,hashSet) ;
    }
}
