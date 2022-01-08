package com.zhuanti.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    List<Integer> t = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subSets(int[] nums){
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); ++mask) {
            t.clear();
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    t.add(nums[i]);
                }
            }
            ans.add(new ArrayList<Integer>(t));
        }
        return ans;
    }

    public List<List<Integer>> subSets1(int[] nums){
        int n = nums.length;
        int res = 1;
        for (int i = 0; i < n; i++) {
            res += 1<<i;
        }
        List<Integer> list = new ArrayList<>();
        for (int i1 = 0; i1 < res; i1++) {
            list.clear();
            for (int i = 0; i < n; ++i) {
                if ((i1 & (1<<i))!=0) {
                    list.add(nums[i]);
                }
            }
            ans.add(new ArrayList<Integer>(list));
            // System.out.println(list);
        }
        return ans;
    }

    public List<List<Integer>> subSets2(int[] nums){
        int n = nums.length;
        int res = 1;
        List<Integer> list = new ArrayList<>();

        for (int i2 = 0; i2 < n; i2++) {
            res += 1<<i2;
            for (int i1 = 0; i1 < res; i1++) {
                list.clear();
                for (int i = 0; i < n; ++i) {
                    if ((i1 & (1 << i)) != 0) {
                        list.add(nums[i]);
                    }
                }
                ans.add(new ArrayList<Integer>(list));
                // System.out.println(list);
            }
        }
        return ans;
    }
    /**
     * 000
     * 001
     * 010
     * 100
     * ……
     * 111
     *
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        SubSets subSets = new SubSets();
        subSets.subSets1(arr);
    }


}
