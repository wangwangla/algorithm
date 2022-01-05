package com.zhuanti.huisu;

import java.util.ArrayList;
import java.util.List;

/**
 * 去重
 *
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,1,2]
 * 输出：
 * [[1,1,2],
 *  [1,2,1],
 *  [2,1,1]]
 * 示例 2：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PermuteUnique {
    private List<List<Integer>> arrayList = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        int vv[] = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        huisu(nums,0,list,vv);
        return arrayList ;
    }

    public void huisu(int[] nums, int start, List<Integer> list, int[] vv){
        if (list.size() == nums.length){
            arrayList.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (vv[i] == 1)continue;
            if (i>0){
                if (nums[i]==nums[i-1]) {
                    continue;
                }
            }
            vv[i] = 1;
            list.add(nums[i]);
            huisu(nums,i+1,list, vv);
            list.remove(list.size() - 1);
            vv[i] = 0;
        }
    }
}
