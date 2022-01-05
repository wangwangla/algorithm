package com.zhuanti.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 78
 *
 * 找到所有的子集
 */
public class Subsets {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        huisu(nums,0,list);
        return lists;
    }

    public void huisu(int arr[],int start,ArrayList<Integer> list){
        lists.add(new ArrayList<>(list));
        for (int i = start; i < arr.length; i++) {
            list.add(arr[i]);
            huisu(arr,i+1,list);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int  arr[] = {1,2,3};
        Subsets subsets = new Subsets();
        subsets.subsets(arr);
    }
}
