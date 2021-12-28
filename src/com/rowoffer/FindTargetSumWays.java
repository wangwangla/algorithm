package com.rowoffer;

public class FindTargetSumWays {
    public int findTargetSumWays(int[] nums, int target) {
        add(nums,0,0,target);
        System.out.println(count);
        return count;
    }


    int count = 0;
    public void add(int[]nums,int index,int currentV,int target){
        if (nums.length <= index){
            if (target == currentV)
                count ++;
        }else {

            add(nums,index+1,currentV+nums[index],target);
            add(nums,index+1,currentV-nums[index],target);
        }
    }


    public int findTargetSumWays1(int[] nums, int target) {

        return count;
    }


    public static void main(String[] args) {
        FindTargetSumWays ways = new FindTargetSumWays();
        int arr[] = {1,1,1,1,1};
        ways.findTargetSumWays(arr,3);
    }

}
