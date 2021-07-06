package com.array;

import java.util.*;
/**
 * @author:28188
 * @date: 2021/7/6
 * @time: 6:54
 */
public class Question01 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length <= 2) return ans;
        Arrays.sort(nums); // O(nlogn)   排序
        for (int i = 0; i < nums.length - 2; i++) { // O(n^2)
            if (nums[i] > 0) break; // 第一个数大于 0，后面的数都比它大，肯定不成立了
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去掉重复情况
            int target = -nums[i];
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));

                    // 现在要增加 left，减小 right，但是不能重复，比如: [-2, -1, -1, -1, 3, 3, 3], i = 0, left = 1, right = 6, [-2, -1, 3] 的答案加入后，需要排除重复的 -1 和 3
                    left++;
                    right--; // 首先无论如何先要进行加减操作
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (nums[left] + nums[right] < target) {
                    left++;
                } else {  // nums[left] + nums[right] > target
                    right--;
                }
            }
        }
        return ans;
    }


    /**
     * @param nums
     * @return
     *
     * 解题思路：
     * 1.判断临界，因为三个数相加，就需要至少3个数
     * 2.排序，方便去重
     * 3.取出一个值，剩下的就变为了两个
     * 4.下标增加  减少  取出不同位置的值
     *
     */
    public List<List<Integer>> three(int []nums){
        List<List<Integer>> ans = new ArrayList();
        if (nums == null || nums.length <3)return ans;//数据不足
        //排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0)break; //排完序之后的
            if (i>0 && nums[i] == nums[i-1]) continue;
            int target = -nums[i];
            int left = i+1;
            int right = nums.length - 1;
            while (left < right){
                if (nums[left] + nums[right] == target){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left ++;
                    right --;
                    while (left < right && nums[left] == nums[left-1])left++;
                    while (left < right && nums[right] == nums[right+1]) right--;
                }else if (nums[left] + nums[right] < target){
                    left ++;
                }else {
                    right --;
                }
            }
        }
        return ans;
    }
    public List<List<Integer>> three1(int []nums){
        List<List<Integer>> ans = new ArrayList();
        if (nums == null || nums.length <3)return ans;//数据不足
        //排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0)break; //排完序之后的
            if (i>0 && nums[i] == nums[i-1]) continue;
            int target = -nums[i];
            int left = i+1;
            int right = nums.length - 1;
            while (left < right){
                if (nums[left] + nums[right] == target){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left ++;
                    right --;
                    while (left < right && nums[left] == nums[left-1])left++;
                    while (left < right && nums[right] == nums[right+1]) right--;
                }else if (nums[left] + nums[right] < target){
                    left ++;
                }else {
                    right --;
                }
            }
        }
        return ans;
    }

    /**
     * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/3sum-closest
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int ans = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = len - 1;
            while (start < end) {
                int value = nums[i] + nums[start] + nums[end];
                if (value == target) {
                    return value;
                }
                if (Math.abs(value - target) < min) {
                    min = Math.abs(value - target);
                    ans = value;
                }
                if (value > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return ans;
    }


}
