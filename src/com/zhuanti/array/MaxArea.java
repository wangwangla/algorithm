package com.zhuanti.array;

public class MaxArea {
    /**
     * 11 - maxArea
     *
     * 思路：
     * 两个柱子之间组成的面积最大、
     * 1.遍历柱子，小的一方决定矩形的大小
     * 2.小的一方变化
     * 。如果相等，任意一方进行变化
     *
     * @param height
     * @return
     */
    public static int maxArea1(int[] height) {
        int left= 0;
        int right = height.length - 1;
        int ar = 0;
        while(right>left){
//            ar=(Math.min(height[left], height[right])*(right-left))>ar
//                    ?(Math.min(height[left], height[right])*(right-left)):ar;
//            拆分一下
            int currentArea = Math.min(height[right], height[left]) * (right - left);
            if (currentArea > ar){
                ar = currentArea;
            }
            if(height[left]>height[right]){
                right--;
            }else {
                left++;
            }
        }
        return ar;
    }

    /**
     * 第二个解法：
     * 每一层进行计算
     * 高度:
     * - 1   area
     * - 2   area
     * ……
     * 一直的到最后的那个最大的
     * @param height
     * @return
     */
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
        for (int i = start; i <= max; i++) {
//            for (int i1 = 0; i1 < height.length; i1++) {
                for (int i1 = start; i1 < height.length; i1++) {
                    if (height[i1] >= i){
                    start = i1;
                    break;
                }
            }

            for (int i1 = end; i1 >= 0; i1--) {
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
