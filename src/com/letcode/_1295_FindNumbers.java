package com.letcode;

public class _1295_FindNumbers {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String str = String.valueOf(nums[i]);
            if (str.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int fin(int []arr){
        int ans = 0;
        for(int n: arr) {
            if( (n>=10 && n<100) || (n>=1000 && n<10000) || n==100000 ) ++ans;
        }
        return ans;
    }
}
