package com.shuati.array;

import java.util.*;
/**
 * @author:28188
 * @date: 2021/7/7
 * @time: 22:20
 */
public class Question05 {
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        Question05 question05 = new Question05();
        question05.permuteUnique(arr);
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int[] visited = new int[nums.length];
        backtrack(res, nums, new ArrayList<Integer>(), visited);
        return res;
    }

    private void backtrack(List<List<Integer>> res, int[] nums, ArrayList<Integer> tmp, int[] visited) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) continue;
            if (i>0) {
                if (nums[i] == nums[i-1]&&visited[i-1]==0) continue;
            }
            visited[i] = 1;
            tmp.add(nums[i]);
            System.out.println(Arrays.asList(tmp));
            backtrack(res, nums, tmp, visited);
            visited[i] = 0;
            tmp.remove(tmp.size() - 1);
        }
    }
}
