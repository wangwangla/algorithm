package com.zhuanti.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 15 - threeSum
 *
 * 三数之和为0
 *
 */
public class ThreeSum {
    /**
     * 思路：
     * 如果想要使用前面的思路
     * 1.取出一个数据，计算数组中两数之和
     * 2.存在重复
     *
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            nums[i] = 0;
            int [] currentNum = twoSum(nums,-num,i);
            if (currentNum != null){
                ArrayList arrayList = new ArrayList<Integer>();
                arrayList.add(currentNum[0]);
                arrayList.add(currentNum[1]);
                arrayList.add(num);
                list.add(arrayList);
            }
            nums[i] = num;
        }
        return list;
    }

    public int[] twoSum(int[] nums, int target,int i1) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (i1 == i)continue;
            int num = nums[i];
            if (hashMap.containsKey(num)){
                int arr[] = new int[2];
                arr[0] = num;
                arr[1] = target - num;
                return arr;
            }
            hashMap.put(target-num,i);
        }
        return null;
    }


    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

        }
        return null;
    }

        public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        ThreeSum sum = new ThreeSum();
        sum.threeSum(arr);

    }
}
