package com.offer.rowoffer;

public class CanPartition {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        if (sum%2!=0) {
            return false;
        }

        int target = sum / 2;
//        for (int i = 0; i < nums.length; i++) {
//
//        }

        return false;
    }

    public void pe(int arr[],int target){

    }
}

/*
*  public boolean canPartition(int[] nums) {
      int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 2 != 0) return false;
        boolean[][] booleans = new boolean[nums.length][sum + 1];
        booleans[0][nums[0]] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int s = 1; s < sum; s++) {
                 booleans[i][s]=booleans[i-1][s];
                if(s-nums[i]>=0)  booleans[i][s]|=booleans[i-1][s-nums[i]];
            }
        }
        return booleans[nums.length-1][(sum / 2)];
    }

作者：wo-du-bu-zhi-dao
链接：https://leetcode-cn.com/problems/NUPfPr/solution/shi-yong-dong-tai-gui-hua-ji-suan-shi-fo-0ckb/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
* */
