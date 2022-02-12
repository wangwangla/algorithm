package com.offer.rowoffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 有重复元素，但是只能使用一次的写法
 */
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<Integer> arrayList = new ArrayList<>();
        dsf(candidates,arrayList,target,0,0);
        return ans;
    }

    public List<List<Integer>> ans = new ArrayList<>();

    private void dsf(int []candidates,List<Integer> list,int target,int pos ,int sum){
        if (sum > target){
            return;
        }
        if (sum == target){
            ans.add(new ArrayList<>(list));
        }
        for (int i = pos; i < candidates.length; i++) {
            //原因：i-->length    i+1------>length    如果arr[i] == arr[i+1]
            if (i>pos&&candidates[i] == candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            dsf(candidates,list,target,i,sum + candidates[i]);
            list.remove(list.size()-1);
        }
    }
}
