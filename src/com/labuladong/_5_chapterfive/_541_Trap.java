package com.labuladong._5_chapterfive;

public class _541_Trap {
    public int trap(int height[]){
        int n = height.length;
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            int l_max = 0, r_max = 0;
            // 找右边最⾼的柱⼦
            for (int j = i; j < n; j++)
                r_max = Math.max(r_max, height[j]);
            // 找左边最⾼的柱⼦
            for (int j = i; j >= 0; j--)
                l_max = Math.max(l_max, height[j]);
            // 如果⾃⼰就是最⾼的话，
            // l_max == r_max == height[i]
            ans += Math.min(l_max, r_max) - height[i];
        }
        return ans;
    }

    public int trap1(int height[]){
        int n = height.length;
        int ans = 0;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i==0)leftMax[i] = height[i];
            else leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        for (int i = n-1; i > 0; i--) {
            if (i == n-1)rightMax[i] = height[i];
            else rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        for (int i = 1; i < n - 1; i++) {
            // 如果⾃⼰就是最⾼的话，
            // l_max == r_max == height[i]
            ans += Math.min(rightMax[i], leftMax[i]) - height[i];
        }
        return ans;
    }



}
