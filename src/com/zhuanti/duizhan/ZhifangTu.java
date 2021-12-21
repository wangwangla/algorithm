package com.zhuanti.duizhan;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ZhifangTu {
    public int trap(int[] height) {
        //求 最大
        int maxHight = 0;
        for (int i : height) {
            if (maxHight < i){
                maxHight = i;
            }
        }

        int left = 0;
        int right=0;
        int count = 0;
        for (int i = 1; i <= maxHight; i++) {
            for (int i1 : height) {
                if (i1>=i){
                    left = i1;
                    break;
                }
            }
            for (int i1 = 1; i1 < height.length; i1++) {
                int last = height[height.length - i1 - 1];
                if (last >= i){
                    right = left;
                    break;
                }
            }
            count += (right - left + 1);
        }
        for (int i : height) {
            count -= i;
        }
        return 0;
    }

    public void trap1(int[] height){
        Deque<Integer> stack = new LinkedList<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty()&&height[i]>height[stack.peek()]){
                Integer pop = stack.pop();
                if (stack.isEmpty()){
                    break;
                }
                int left = stack.peek();
                int currWidth = i - left - 1;
                int currHight = Math.min(height[i],height[left]) - height[pop];
                ans += currWidth * currHight;
            }
            stack.push(i);
        }
//        return ans;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        ZhifangTu tu = new ZhifangTu();
        tu.trap1(new int[]{1,2,3});
    }
}
