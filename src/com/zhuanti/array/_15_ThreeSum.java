package com.zhuanti.array;

import java.util.*;

/**
 *
 *
 * 有空学习一下
 *
 * 15 - threeSum
 *
 * 三数之和为0
 *
 * 去重的方式，将结果进行排序，然后将结果去重
 * 可以先转成字符串在去重，也可以将结果排序在去重
 */
public class _15_ThreeSum {

    List<List<Integer>> a = new ArrayList<>();
    public List<List<Integer>> threeSum121(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int t[] = new int[arr.length];
        xxx(arr,arrayList,t);
        return a;
    }

    private int xxks = 0;
    private void xxx(int arr[],ArrayList<Integer> arrayList,int[]dp){
        if (arrayList.size() == 3){
            int sum = 0;
            for (Integer integer : arrayList) {
                sum += integer;
            }
            if (sum == 0){
                a.add(new ArrayList(arrayList));
            }
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (dp[i] == 1)continue;
            dp[i] = 1;
            arrayList.add(arr[i]);
            xxx(arr,arrayList,dp);
            arrayList.remove(arrayList.size()-1);
            dp[i] = 0;
        }
    }
    /**
     * 暴力解法
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum2(int[] nums) {
        int length = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int i1 = i+1; i1 < length; i1++) {
                for (int i2 = i1+1; i2 < length; i2++) {
                    if (nums[i]+nums[i1]+nums[i2] == 0){
                        list.add(Arrays.asList(nums[i],nums[i1],nums[i2]));
                    }
                }
            }
        }
        return list;
    }

    /**
     * 去重
     */
    public List<List<Integer>> threeSum3(int[] nums) {
        int length = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < length; i++) {
            for (int i1 = i+1; i1 < length; i1++) {
                for (int i2 = i1+1; i2 < length; i2++) {
                    if (nums[i]+nums[i1]+nums[i2] == 0){
                        List<Integer> list1 = Arrays.asList(nums[i], nums[i1], nums[i2]);
                        Collections.sort(list1);
                        if (!hashSet.contains(list1)){
                            list.add(list1);
                            hashSet.add(list1);
                        }
                    }
                }
            }
        }
        return list;
    }

    public List<List<Integer>> threeSum4(int[] nums) {
        int length = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        HashSet hashSet = new HashSet();
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            for (int i1 = i+1; i1 < length; i1++) {
                for (int i2 = i1+1; i2 < length; i2++) {
                    if (nums[i]+nums[i1]+nums[i2] == 0){
                        List<Integer> list1 = Arrays.asList(nums[i], nums[i1], nums[i2]);
                        if (!hashSet.contains(list1)){
                            list.add(list1);
                            hashSet.add(list1);
                        }
                    }
                }
            }
        }
        return list;
    }

    public List<List<Integer>> threeSum5(int[] nums) {
        int length = nums.length;
//        List<List<Integer>> list = new ArrayList<>();
        HashSet hashSet = new HashSet();
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            for (int i1 = i+1; i1 < length; i1++) {
                for (int i2 = i1+1; i2 < length; i2++) {
                    if (nums[i]+nums[i1]+nums[i2] == 0){
                        List<Integer> list1 = Arrays.asList(nums[i], nums[i1], nums[i2]);
                        if (!hashSet.contains(list1)){
//                            list.add(list1);
                            hashSet.add(list1);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(hashSet);
    }

    public List<List<Integer>> threeSum6(int[] nums) {
        int length = nums.length;
        HashSet hashSet = new HashSet();
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[left] + nums[right];
                if (sum == target){
                    hashSet.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left ++;
                    right --;
                }else if (sum < target){
                    left ++;
                }else {
                    right --;
                }
            }
        }
        return new ArrayList<>(hashSet);
    }

    public List<List<Integer>> threeSum9(int[] nums) {
        int length = nums.length;
        ArrayList hashSet = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {

            if (i>0&&nums[i]==nums[i-1])continue;
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[left] + nums[right];
                if (sum == target){
                    hashSet.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left<right&&nums[left]==nums[++left]);
                    while (left<right&&nums[right]==nums[--right]);
                }else if (sum < target){
                    left ++;
                }else {
                    right --;
                }
            }
        }
        return hashSet;
    }










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
                Collections.sort(arrayList);
                String s = arrayList.toString();
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

    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        _15_ThreeSum sum = new _15_ThreeSum();
        System.out.println(sum.threeSum9(arr));
    }
}
