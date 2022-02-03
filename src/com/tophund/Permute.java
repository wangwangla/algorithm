package com.tophund;

import java.util.ArrayList;
import java.util.List;

public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int ss[] = new int[nums.length];
        xx(nums,arrayList,0,ss);
        System.out.println("-----------");
        return null;
    }

    public void xx(int []nums,ArrayList<Integer> arrayList,int start,int[]ss){
        if (arrayList.size() >= 3){
            System.out.println(arrayList.toString());
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (ss[i]==1)continue;
            ss[i] = 1;
            arrayList.add(nums[i]);
            xx(nums,arrayList,i+1,ss);
            arrayList.remove(arrayList.size()-1);
            ss[i] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        Permute permute = new Permute();
        permute.permute(arr);

    }
}
