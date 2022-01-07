package com.zhuanti.erfenchazhao;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int length = nums.length;
        int dp[] = new int[length + 1];

        for (int i = 1; i <= nums.length; i++) {
            if (dp[nums[i-1]]==0) {
                dp[nums[i-1]] = nums[i-1];
            }else{
                return nums[i-1];

            }
        }
        return 0;
    }

    public int findDuplicate1(int[] nums) {
        int length = nums.length;
        int dp[] = new int[length + 1];

        for (int i = 1; i <= nums.length; i++) {
            if (dp[nums[i-1]]==0) {
                dp[nums[i-1]] = nums[i-1];
            }else{
                return nums[i-1];

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        FindDuplicate findDuplicate = new FindDuplicate();
        System.out.println(findDuplicate.findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }
}
