package com.zhuanti.array;

public class ZhuangShui {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        ZhuangShui zhuangShui = new ZhuangShui();
        System.out.println(zhuangShui.maxArea(arr));
    }
    public int maxArea(int[] height){
        int max = Integer.MIN_VALUE;
        for (int i : height) {
            if (i>max){
                max = i;
            }
        }
        int count = 0;
        int maxCount = 0;
        int start = 0;
        int end = height.length-1;
        for (int i = 0; i <= max; i++) {
            for (int i1 = 0; i1 < height.length; i1++) {
                if (height[i1] >= i){
                    start = i1;
                    break;
                }
            }

            for (int i1 =  height.length-1; i1 >= 0; i1--) {
                if (height[i1]>=i){
                    end = i1;
                    break;
                }
            }

            count = (end - start) * i;
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
}
