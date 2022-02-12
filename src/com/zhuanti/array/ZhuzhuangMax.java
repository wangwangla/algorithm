package com.zhuanti.array;

public class ZhuzhuangMax {
    public static void main(String[] args) {

    }

    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        // 特判
        if (len == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int current = heights[i];
            int left = i;
            int right = i;
//            左边找
            while (left>0&&heights[left-1]>=current){
                left --;
            }

            while (right<heights.length&&heights[right+1]>=current){
                right ++;
            }

            max = Math.max(max,current*(right-left+1));
        }
        return max;
    }
}
