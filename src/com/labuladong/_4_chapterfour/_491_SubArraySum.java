package com.labuladong._4_chapterfour;

import java.util.HashSet;

public class _491_SubArraySum {
    public int subrraysum(int []nums,int k){
        int n = nums.length;
        int sum[] = new int[n+1];
        sum[0] = 0;
        HashSet<Integer> hashMap = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
            int x = sum[i+1] - k;
            if (hashMap.contains(x)){

            }
            hashMap.add(x);
        }
        for (int i = 1; i <= n; i++) {
            for (int i1 = 0; i1 < i; i1++) {
                if (sum[i] - sum[i1] == k){

                }
            }
        }

        for (int i = 0; i < n; i++) {
            if(sum[i] == sum[i]-k){

            }
        }
        return 0;
    }
}
