package com.zhuanti.string;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        ThreeSumClosest closest = new ThreeSumClosest();
        closest.threeSumClosest(new int[]{0,1,2},3);
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        xx(nums,0,0,target,0);
        return xx;
    }

    private int min = Integer.MAX_VALUE;
    private int xx = 0;

    public void xx(int[] nums,int start,int sum,int target,int num){
        if (sum - target > min){
            return;
        }
        if (num == 3){
            System.out.println(sum);
            int old = min;
            min = Math.min(min , Math.abs(sum - target));
            if (old != min)xx = sum;
            return;
        }
        if (start==nums.length)return;
        for (int i = start; i < nums.length; i++) {
            num++;
            sum+=nums[i];
            xx(nums,i+1,sum,target,num);
            sum-=nums[i];
            num--;
        }
    }
}
