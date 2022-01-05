package com.zhuanti.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    private ArrayList<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<Integer> arrayList = new ArrayList<>();
        huisu(candidates,0,0,target,arrayList);
        return resList;
    }

    public void huisu(int []candidates,int start,int num,int target,List<Integer> list){
//        num += candidates[start];
//        if (num>target)return;
        if (num == target){
            resList.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            if (num + candidates[i]>target)break;
            huisu(candidates,i,num+candidates[i],target,list);
            list.remove(list.size()-1);
        }
    }
}
