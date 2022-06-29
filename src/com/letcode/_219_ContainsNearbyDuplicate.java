package com.letcode;

import java.util.HashSet;

public class _219_ContainsNearbyDuplicate {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        for (int i = 0; i < nums.length - k; i++) {
//            for (int j = i+k; j < nums.length; j++) {
//                if (nums[i] == nums[j])return true;
//            }
//        }
//        return false;
//    }
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int i = 0; i < nums.length - k; i++) {
//            if (hashSet.contains(nums[i])) {
//                return true;
//            }
//            hashSet.add(nums[i]);
//            if (hashSet.size()>k){
//                hashSet.remove(nums[i-k]);
//            }
//        }
//        return false;
//    }
//
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <= i+k; j++) {
                if (j >= nums.length)break;
                if (nums[i] == nums[j])return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        _219_ContainsNearbyDuplicate containsNearbyDuplicate = new _219_ContainsNearbyDuplicate();
        System.out.println(containsNearbyDuplicate.containsNearbyDuplicate(new int[]{99, 99}, 2));
    }
}
