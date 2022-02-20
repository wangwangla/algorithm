package com.labuladong._2_chaptertwo;

public class _282_EquealSum {

    public boolean canPartition(int[] nums) {
        //首先累加所有元素的和，如果其是一个奇数就不可能找到一个某几个个元素的和等于它的一般
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        if(sum % 2 != 0){
            return false;
        }
        //接着可以把这个问题转化为一个01背包问题，从本集合中挑选出几个数使得它的和为sum/2，每个数只能使用一遍
        return helper(nums,sum/2);
    }

    private boolean helper(int[] nums, int target) {
        //使用一个一维数组来缓存状态，可以使用一维数组的前提在于确定本元素只依赖于上一行的所有在i之前的元素，所以我们需要从后往前覆盖元素
        boolean dp[] = new boolean[target + 1];
        dp[0] = true;
        //挑选出前i个元素，对于前i个元素确定前i个元素能否挑选出某几个来构成j，可以构成j的标准在于前i - 1个元素如果能直接构成j我们可以选择不加入第i个元素，如果前i - 1个元素不能构成j，我们就尝试加入第i个元素查看前i - 1个元素能否构成j - nums[i]。
        for(int i = 1;i <= nums.length;i++){
            for(int j = target;j >= 1;j--){
                //先查看不加入的情况
                //如果不加入为false尝试加入
                if(!dp[j] && nums[i - 1] <= j){
                    dp[j] = dp[j - nums[i - 1]];
                }
            }
        }
        return dp[target];
    }
}
