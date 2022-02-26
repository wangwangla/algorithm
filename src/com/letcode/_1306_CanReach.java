package com.letcode;

public class _1306_CanReach {
    public boolean canReach(int[] arr, int start) {
        boolean [] dp = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            start = arr[i] + start;
            dp[start] = true;
        }
        return false;
    }
}
