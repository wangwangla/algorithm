package com.zhuanti.array;

import java.util.*;
/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 示例 2：
 *
 * 输入：nums = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：nums = [0]
 * 输出：[]
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 我认为可以使用回溯
 */
public class Question09 {
    private int num;
    public List<List<Integer>> threeSum(int[] nums) {
        num = nums.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(nums);
        su(arrayList,nums,0);
        return null;
    }

    public void su(ArrayList<Integer> arrayList,int nums[],int start){
        if (arrayList.size() == 2) {
//            System.out.println(Arrays.asList(arrayList));
            int num = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                num += arrayList.get(i);
            }
            if (num == 0){
                System.out.println(Arrays.asList(arrayList));
            }
            return;
        }
        for (int i = start; i < nums.length; i++) {
            arrayList.add(nums[i]);
            su(arrayList,nums,i+1);
            arrayList.remove(arrayList.size()-1);
        }
    }

    public static void main(String[] args) {
        int []nums = {-1,0,1,2,-1,-4};
        Question09 question09 = new Question09();
        question09.threeSum(nums);
    }
}
