package com.zhuanti.dongtaiguihua;

/**
 * 动态 规划 接雨水
 */
public class Question06 {
    public static void main(String[] args) {

    }

    public int ruinWater(int []height){
        int n = height.length;
        if (n == 0)return 0 ;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            if (leftMax[i]<height[i]) {
                leftMax[i] = height[i];
            }else {
                leftMax[i] = leftMax[i-1];
            }
        }
        int [] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >=0; i--) {
            if (rightMax[i]<height[i]) {
                rightMax[i] = height[i];
            }else {
                rightMax[i] = rightMax[i+1];
            }
        }


        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(leftMax[i],rightMax[i])-height[i];
        }
        System.out.println();
        return 0;
    }
}
