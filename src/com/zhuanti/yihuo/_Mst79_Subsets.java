package com.zhuanti.yihuo;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 示例 2：
 *
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * nums 中的所有元素 互不相同
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/TVdhkn
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _Mst79_Subsets {
    ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        sub(a,0,nums);
        return null;
    }

    public void sub(ArrayList<Integer> a,int start,int nums[]){
        arrayList.add(new ArrayList<>(a));
        for (int i = start; i < nums.length; i++) {
            a.add(nums[i]);
            sub(a,i+1,nums);
            a.remove(nums[i]);
        }
    }

    public static void main(String[] args) {
        int num[] = {1,2,3};
        _Mst79_Subsets subsets = new _Mst79_Subsets();
        subsets.subsets(num);
    }
}
