package com.shuati.array;

import java.util.*;
/**
 * @author:28188
 * @date: 2021/7/7
 * @time: 7:17
 */
public class Question03 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List list = new ArrayList();
        List<List<Integer>> lists = new ArrayList<>();
        //排序是为了可以提前结束
        Arrays.sort(candidates);
        huisuma2(candidates,0,candidates.length,target,list,lists);
        return lists;
    }

    private void huisuma2(int can[], int start, int end,int target, List arrayList,List nn){
        if (target == 0){
            nn.add(new ArrayList<>(arrayList));
        }
        for (int i = start; i < end; i++) {
            if (target - can[i]<0)break;

            if (i > start && can[i] == can[i - 1]) {
                continue;
            }

            arrayList.add(can[i]);
            System.out.println(Arrays.asList(arrayList));
            huisuma2(can,i+1,end,target - can[i],arrayList,nn);
            arrayList.remove(arrayList.size()-1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1,6};
        Question03 ar = new Question03();
        List<List<Integer>> lists = ar.combinationSum(arr, 8);
        System.out.println(Arrays.asList(lists));
    }
}
