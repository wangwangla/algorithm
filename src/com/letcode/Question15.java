package com.letcode;

/**
 *
 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

 你的算法时间复杂度必须是 O(log n) 级别。

 如果数组中不存在目标值，返回 [-1, -1]。

 示例 1:

 输入: nums = [5,7,7,8,8,10], target = 8
 输出: [3,4]
 示例 2:

 输入: nums = [5,7,7,8,8,10], target = 6
 输出: [-1,-1]

 这个题还是需要优化，一个排序不是乱写的条件，需要进行优化
 */
public class Question15 {
    /** 
     * 这个提不写了，升序排列作为一个条件，我们可以从前向后，从后向前。
     * 我们没有必要一直都去执行
     *
     * 这个也提供了另一个就是二分查找，找到一个值之后，向前向后找出另一个
     *
     */

}
