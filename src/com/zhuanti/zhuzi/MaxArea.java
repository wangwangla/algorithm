package com.zhuanti.zhuzi;

public class MaxArea {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        int curMax = max;
        int index = 0;
        for (int i = 0; i < heights.length; i++) {
            int curr = heights[i];
            curMax = curr;
            index = i;
            for (int i1 = i+1; i1 < heights.length; i1++) {
                if (heights[i1]>=curr){
                    index = i1;
                }else {
                    break;
                }
            }
            int start =i;
            for (int i1 = i-1; i1 >=0; i1--) {
                if (heights[i1]>=curr){
                    start = i1;
                }else {
                    break;
                }
            }
            max = Math.max(max,curr * (index - start + 1));
            System.out.println(curr +"       "+index+"     "+start+"======"+max);
        }
        return max;
    }

    public int largestRectangleArea1(int[] heights) {
        int max = 0;
        int maxNum = 0;
        for (int height : heights) {
            maxNum = Math.max(maxNum,height);
        }
        for (int i = 0; i < maxNum; i++) {
            for (int height : heights) {
                if (height>i){

                }
            }
        }
        return max;
    }



    public static void main(String[] args) {
        int arr [] = {2,1,2};
        MaxArea area = new MaxArea();
        System.out.println(area.largestRectangleArea(arr));
    }
}
