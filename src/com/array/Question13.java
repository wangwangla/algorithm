package com.array;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * 16. 最接近的三数之和
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 *
 *
 * 示例：
 *
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 *
 *
 * 提示：
 *
 * 3 <= nums.length <= 10^3
 * -10^3 <= nums[i] <= 10^3
 * -10^4 <= target <= 10^4
 * 通过次数231,477提交次数503,624
 */
public class Question13 {

        // public int threeSumClosest(int[] nums, int target) {
        //     Arrays.sort(nums);
        //     int min = Integer.MAX_VALUE;
        //     int ans = 0;
        //     int len = nums.length;
        //     for (int i = 0; i < len; i++) {
        //         if (i > 0 && nums[i] == nums[i - 1]) {
        //             continue;
        //         }
        //         int start = i + 1;
        //         int end = len - 1;
        //         while (start < end) {
        //             int value = nums[i] + nums[start] + nums[end];
        //             if (value == target) {
        //                 return value;
        //             }
        //             if (Math.abs(value - target) < min) {
        //                 min = Math.abs(value - target);
        //                 ans = value;
        //             }
        //             if (value > target) {
        //                 end--;
        //             } else {
        //                 start++;
        //             }
        //         }
        //     }
        //     return ans;
        // }
        int min = Integer.MAX_VALUE;
        int res = 0;
        boolean flag = false;
        public void su(ArrayList<Integer> arrayList,int nums[],int start,int target){
            if(flag)return;
            if (arrayList.size() == 3) {
//            System.out.println(Arrays.asList(arrayList));
                int num = 0;
                for (int i = 0; i < arrayList.size(); i++) {
                    num += arrayList.get(i);
                }

                // 回溯可以做,但是找到最小的时候并不能及时返回,所以执行的结果也是很浪费时间的
                if(num == target){
                    flag = true;
                    res = num;
                    return;
                }
                min = Math.min(Math.abs(num - target),min);
                if (min == Math.abs(num - target)){
                    res = num;
                }
                return;
            }
            for (int i = start; i < nums.length; i++) {

                arrayList.add(nums[i]);
                su(arrayList,nums,i+1,target);
                arrayList.remove(arrayList.size()-1);
            }
        }

        public int threeSumClosest(int[] nums, int target) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            Arrays.sort(nums);
            su(arrayList,nums,0,target);
            return res;
        }

}
