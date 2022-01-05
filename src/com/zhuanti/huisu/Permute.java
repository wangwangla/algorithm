package com.zhuanti.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 回溯+去重
 */
public class Permute {
    private List<List<Integer>> arrayList = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        huisu(nums,0,list);
        return arrayList ;
    }

    public void huisu(int []nums,int start,List<Integer> list){
        if (list.size() == nums.length){
            arrayList.add(new ArrayList<>(list));
            System.out.println(list.toString());
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.size()>0){
                if (list.contains(nums[i])) {
                    continue;
                }
            }
            list.add(nums[i]);
            huisu(nums,i+1,list);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> permute1(int[] nums) {
        int vv[] = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        huisu(nums,0,list,vv);
        return arrayList ;
    }

    public void huisu(int[] nums, int start, List<Integer> list, int[] vv){
        if (list.size() == nums.length){
            arrayList.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (vv[i] == 1)continue;
            vv[i] = 1;
            list.add(nums[i]);
            huisu(nums,i+1,list, vv);
            list.remove(list.size() - 1);
            vv[i] = 0;
        }
    }

    public static void main(String[] args) {
        Permute permute = new Permute();
        int nums[] = {1,2,3};
        permute.permute(nums);
    }
}
