package com.zhuanti.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target1) {
        int length = nums.length;
        ArrayList hashSet = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < length-3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int i1 = i + 1; i1 < length - 2; i1++) {
                if (i1 > i+1 && nums[i1] == nums[i1 - 1]) continue;
                int target = target1 - nums[i1]-nums[i];
                int left = i1 + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (sum == target) {
                        hashSet.add(Arrays.asList(nums[i], nums[i1],nums[left], nums[right]));
                        while (left < right && nums[left] == nums[++left]) ;
                        while (left < right && nums[right] == nums[--right]) ;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return hashSet;
    }
}
