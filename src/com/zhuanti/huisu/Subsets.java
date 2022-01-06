package com.zhuanti.huisu;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List listTemp = new ArrayList();
        xx(nums,0,listTemp);
        return list;
    }

    public void xx(int []nums,int start,List<Integer> listTemp){
        list.add(new ArrayList(listTemp));
//        System.out.println(listTemp);
        for (int i = start; i < nums.length; i++) {
            listTemp.add(nums[i]);
            xx(nums,i+1,listTemp);
            listTemp.remove(listTemp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        Subsets subsets = new Subsets();
        subsets.subsets(arr);
    }
}
