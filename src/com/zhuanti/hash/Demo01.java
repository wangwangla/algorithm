package com.zhuanti.hash;

import javax.naming.ldap.HasControls;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo01 {
    //方法一： 变量的方式
    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        int data;
        for(int i=0;i<nums.length;i++) {
            data = target-nums[i];
            for(int j=0;j<i;j++) {
                if(data == nums[j]) {
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
    //方法二： 使用hashmap存储
    public int[] twoSum2(int[] nums, int target) {
        int [] arr = new int[2];
        Map<Integer,Integer> m = new HashMap<>();
        int data;
        //先将所有的数据装入一个数组中
        for(int i=0;i<nums.length;i++) {
            m.put(nums[i], i);
        }
        //循环遍历他们
        for(int i=0;i<nums.length;i++) {
            data = target-nums[i];
            if(m.containsKey(data)&&m.get(data) != i) {
                arr[0]=i;
                arr[1]=m.get(data);
                return arr;
            }
        }
        return arr;
    }
//    第二种优化：
    public int[] twoSum3(int[] nums, int target) {
        int[] indexs = new int[2];
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
        }
        return indexs;
    }
}
