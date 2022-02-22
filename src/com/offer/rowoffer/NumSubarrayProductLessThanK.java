package com.offer.rowoffer;

import java.util.ArrayList;

public class NumSubarrayProductLessThanK {
    private int count = 0;
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int[nums.length];
        per(list,nums,0,1,k,arr);
        return count;
    }

    private void per(ArrayList<Integer> list, int[] nums, int start,int sum,int k,int arr[]) {
        if (sum < k){
            if (!list.isEmpty()) {
                count++;
                System.out.println(list);
            }
        }else{
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if(list.size()>0){
                if(arr[i-1]!=1){

                    continue;
                }
            }
            arr[i] = 1;

            list.add(nums[i]);

            per(list,nums,i+1,sum*nums[i],k,arr);

            list.remove(list.size()-1);
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {

        int arr[] = {10,5,2,6};
//        100

        NumSubarrayProductLessThanK k  = new NumSubarrayProductLessThanK();
        k.numSubarrayProductLessThanK(arr,100);
    }

    public int numSubarrayProductLessThanK1(int[] nums, int k) {
        int n = nums.length;
        int left = 0, right = 0;
        int mul = 1;
        int res = 0;
        for(;right<n;right++){

            mul *= nums[right];
            //当 mul>= k, 收缩滑动窗口的左边界
            while(left<=right&&mul>=k){
                res += n-right;
                mul /= nums[left++];
            }
        }
        return n*(1+n)/2-res;
    }
}
