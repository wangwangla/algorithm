package com.dongtaiguihua;

public class Question02 {
//    public int trap(int[] height) {
//        int dp[] = new int[height.length];
//        dp[0] = 0;
//        int lastHight = height[0];
//        for (int i = 1; i < height.length; i++) {
//            if (dp[i]>=lastHight) {
//                dp[i] = 0;
//                lastHight = height[i];
//            }else {
//                dp[i] = height[i] - lastHight;
//            }
//        }
//        int num = 0;
//        for (int i = 0; i < dp.length; i++) {
////            num += height[i];
//            System.out.println(dp[i]);
//        }
//        return num;
//    }
    public int trap(int[] height) {
        //一层 一层求
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i]>max)max = height.length;
        }
        int left = 0;
        int right = 0 ;
        int length = height.length;
        int tatal = 0;
        for (int i = 0; i < max; i++) {
            while (left<length){
                if (height[left]<=i){
                    left++;
                }else {
                    break;
                }
            }
            while (right>0){
                if (height[right]<=i){
                    right--;
                }else {
                    break;
                }
            }
            tatal += right-left+1;
        }
        return tatal;
    }

    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        Question02 question02 = new Question02();
        question02.trap(height);
    }
}
