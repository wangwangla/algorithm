package com.rowoffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  允许重复选择
 *
 * 给定一个无重复元素的正整数数组 candidates 和一个正整数 target ，找出 candidates 中所有可以使数字和为目标数 target 的唯一组合。
 *
 * candidates 中的数字可以无限制重复被选取。如果至少一个所选数字数量不同，则两种组合是唯一的。 
 *
 * 对于给定的输入，保证和为 target 的唯一组合数少于 150 个。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/Ygoe9J
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            // ans.add(list);
            ans.add(new ArrayList<>(list));
        }
        for (int i = pos; i < candidates.length; i++) {
            list.add(candidates[i]);
            dsf(candidates,list,target,i,sum + candidates[i]);
            list.remove(list.size()-1);
        }
    }
}
