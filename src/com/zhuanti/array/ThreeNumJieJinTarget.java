package com.zhuanti.array;

import java.util.Arrays;

public class ThreeNumJieJinTarget {
    public int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            for (int i1 = 0; i1 < length; i1++) {
                for (int i2 = 0; i2 < length; i2++) {
                    if (i != i1 && i!=i2 &&i1!=i2){
                        int i3 = nums[i] + nums[i1] + nums[i2];
                        if (min>i3){
                            min = i3;
                        }
                    }
                }
            }
        }
        return 0;
    }

    /**
     * 两个数字加起来  得到第三个数字  找出和第三个数最近的
     *
     */
    public int threeSumClosest1(int[] nums, int target) {
        Arrays.sort(nums);
        int close = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i+1;
            int r = nums.length -1;
            while (l<r){
                int three = nums[i] + nums[l] + nums[r];
                if (Math.abs(three - target)<Math.abs(close - target)){
                    close = three;
                }
                if (three > target){
                    r --;
                }else if (three < target){
                    l --;
                }else {
                    return target;
                }
            }
        }
        return close;
    }
}
