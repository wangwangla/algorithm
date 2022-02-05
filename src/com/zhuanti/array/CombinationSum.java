package com.zhuanti.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class CombinationSum {
    public static void main(String[] args) {
        int arr[] = {100,3,6,7};
        CombinationSum sum = new CombinationSum();
        sum.combinationSum(arr,7);
    }

    private List<List<Integer>> listss = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            if (i>0){
                if (arr[i] == arr[i-1]){
                    continue;
                }
            }
            list.add(arr[i]);
            sum = sum+arr[i];
            xxx(arr,i+1,target,sum,list);
            sum = sum-arr[i];
            list.remove(list.size()-1);
        }
    }

}
