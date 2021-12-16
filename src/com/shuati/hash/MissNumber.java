package com.shuati.hash;

public class MissNumber {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int temp[] = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = Integer.MAX_VALUE;
        }
        for (int num : nums) {
            temp[num] = num;
        }
        for (int i = 0; i < length; i++) {
            if (temp[i]==Integer.MAX_VALUE){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    public int missingNumber1(int[] nums) {
        int length = nums.length;
        boolean temp[] = new boolean[length];
        for (int i = 0; i < length; i++) {
            temp[i] = false;
        }
        for (int num : nums) {
            temp[num] = true;
        }
        for (int i = 0; i < length; i++) {
            if (!temp[i]){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }


    public int missingNumber2(int[] nums) {
        int length = nums.length;
        //等差树列

        //减去每一个

        return 0;
    }
}
