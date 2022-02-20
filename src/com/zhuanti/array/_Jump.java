package com.zhuanti.array;


public class _Jump {
    public int jump(int[] nums) {
        int min = Integer.MAX_VALUE;
        int target = nums.length - 1;
        int curr  = nums.length - 1;
        int count = 0;
        if (nums.length <= 1)return 0;
        for (int i = target; i >= 0; i--) {
            for (int i1 = 0; i1 < curr; i1++) {
                if (i1+nums[i1]>=target){
                    min = Math.min(min,i1);
                    curr = min;
                }
            }
            target = curr;
            count ++;
            if (min == 0)break;
        }
        return count;
    }

    public int jump1(int[] nums) {
        int ans = 0;
        int start = 0;
        int end = 1;
        while (end<nums.length){
            int maxPos = 0;
            for (int i = start; i < end; i++) {
                maxPos = Math.max(maxPos,i+nums[i]);
            }
            start = end;
            end = maxPos+1;
            ans++;
        }
        return 0;
    }


    /**
     * int jump(vector<int>& nums)
     * {
     *     int ans = 0;
     *     int end = 0;
     *     int maxPos = 0;
     *     for (int i = 0; i < nums.size() - 1; i++)
     *     {
     *         maxPos = max(nums[i] + i, maxPos);
     *         if (i == end)
     *         {
     *             end = maxPos;
     *             ans++;
     *         }
     *     }
     *     return ans;
     * }
     *
     * 作者：ikaruga
     * 链接：https://leetcode-cn.com/problems/jump-game-ii/solution/45-by-ikaruga/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * */

    public static void main(String[] args) {
        int arr[] = {2,3,1,1,4};
        _Jump jump = new _Jump();
        jump.jump(arr);
    }
}
