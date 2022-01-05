package com.zhuanti.huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    private ArrayList<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<Integer> arrayList = new ArrayList<>();
        huisu(candidates,0,0,target,arrayList);
        return resList;
    }

    public void huisu(int []candidates,int start,int num,int target,List<Integer> list) {
        if (num == target) {
            resList.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (num + candidates[i] > target) break;
            if (i>start){
                if (candidates[i-1]==candidates[i]){
                    continue;
                }
            }
            list.add(candidates[i]);
            huisu(candidates, i+1, num + candidates[i], target, list);
            list.remove(list.size() - 1);
        }
    }
}
