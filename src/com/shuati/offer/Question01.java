package com.shuati.offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author:28188
 * @date: 2021/4/4
 * @time: 21:51
 */
public class Question01 {

//    找出数组中重复的数字。
//
//
//    在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
//
//    示例 1：
//
//    输入：
//            [2, 3, 1, 0, 2, 5, 3]
//    输出：2 或 3
//             
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

    public static int findRepeatNumber(int[] nums) {
        HashMap<Integer,Integer> xx = new HashMap<>();
        if (nums.length == 0||nums.length==1)return 0;
        if (nums.length%2!=0){
            xx.put(nums[nums.length/2],nums[nums.length/2]);
        }
        for (int i = 0; i < nums.length/2; i++) {
            if (xx.containsKey(nums[i]))return nums[i];
            xx.put(nums[i],0);
            if (xx.containsKey(nums[nums.length-1-i]))return nums[i];
            xx.put(nums[nums.length-1-i],0);
        }
        return 0;
    }


    public int findRepeatNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }

    public int findRepeatNumber2(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i){
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        int nums [] = {1,2,5,7,4,78};
        findRepeatNumber(nums);
    }
}
