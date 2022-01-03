package com.zhuanti.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int arr[] = {1,1,6};
        CombinationSum2 sum = new CombinationSum2();
        sum.combinationSum2(arr,8);
    }

    private List<List<Integer>> listss = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        xxx(candidates,0,target,0,list);
        return listss;
    }



    private void xxx(int arr[],int start,int target,int sum,List<Integer> list){
        if (sum == target){
            System.out.println(list);
            listss.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (sum > target)break;
            if (i>start){
                if (arr[i] == arr[i-1]){
                    continue;
                }
            }
            list.add(arr[i]);
            xxx(arr,i+1,target,sum + arr[i],list);
            list.remove(list.size()-1);
        }
    }


}