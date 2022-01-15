package com.zhuanti.sort;

public class MissingNumbermissingNumber {
//    public int missingNumber(int[] nums) {
//        int num = 0;
//        for (int i = 1; i < nums.length + 1; i++) {
//            num+=i;
//            num -= nums[i];
//        }
////        System.out.println(num);
//        return num;
//    }
    public int missingNumber(int[] nums) {
        int num = 0;
        for (int i = 1; i < nums.length + 1; i++) {
            num ^= i ^ nums[i];
        }
    //        System.out.println(num);
        return num;
    }

}
