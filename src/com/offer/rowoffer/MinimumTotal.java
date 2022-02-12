package com.offer.rowoffer;

import java.util.List;

public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        int current = 0;
        for (int i = 0; i < triangle.size(); i++) {
            List<Integer> list = triangle.get(i);
//            if (current>0){
                list.get(current-1);
//            }else if (current<)
            int num = list.get(current);
            sum += num;
        }
        return 0;
    }

    public int minimumTotal1(List<List<Integer>> triangle) {
        int size = triangle.size();
        List<Integer> r = triangle.get(0);
        int size1 = r.size();
        int dp[][] = new int[size][size];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < size; i++) {
            dp[i][0] = dp[i-1][0]+triangle.get(i).get(0);
            for (int i1 = 1; i1 < i; i1++) {
                dp[i][i1] = Math.min(dp[i-1][i1-1],dp[i-1][i1]) + triangle.get(i).get(i1);
            }
            dp[i][i] = dp[i-1][i-1] + triangle.get(i).get(i);
        }
        int min = dp[size-1][0];
        for (int i = 0; i < size; i++) {
            min = Math.min(min,dp[size-1][i]);
        }
        return min;
    }
}
