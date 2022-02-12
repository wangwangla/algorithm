package com.shuati.letcode;

import java.util.ArrayList;

/**
 * @author:28188
 * @date: 2021/5/19
 * @time: 7:09
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int [] aa = {0,1,0,3,12};
        moveZeroes2(aa);
    }

    //方法一：直接记录数据  ，然后最后的zhi为0
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : nums) {
            if (num!=0){
                arrayList.add(num);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < nums.length; i++) {
            if (i<size){
                nums[i] = arrayList.get(i);
            }else {
                nums[i] = 0;
            }
        }
    }

    public static void moveZeroes1(int[] nums) {
        int index  =0 ;
        boolean flag= false;
        int xx = 0;
        for (int i1 = 0; i1 < nums.length; i1++) {
            if (nums[i1]==0){
                if (flag)continue;
                index = i1;
                flag = true;
            }else
            if (nums[i1] != 0){
                if (flag){
                    nums[index] = nums[i1];
                    nums[i1] = 0;
                    flag = false;
                }
                xx ++;
            }
        }
    }


    /*执行用时：
0 ms
, 在所有 Java 提交中击败了
100.00%
的用户
内存消耗：
38.8 MB
, 在所有 Java 提交中击败了
36.59%
的用户*/
    public static void moveZeroes2(int[] nums) {
        int xx = 0;
        for (int i1 = 0; i1 < nums.length; i1++) {
            if (nums[i1] != 0){
                nums[xx] = nums[i1];
                if (i1>xx)nums[i1] = 0;
                xx++;
            }
        }
    }
}
