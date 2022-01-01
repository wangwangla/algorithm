package com.zhuanti.duizhan;

import java.util.Deque;
import java.util.LinkedList;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures){
        int ans[] = new int[temperatures.length];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while ( !stack.isEmpty()&&temp > temperatures[stack.peek()]){
                int pre = stack.pop();
                stack.pop();
                ans[pre] = i - pre;

            }
            stack.push(i);
        }
        return ans;
    }
}
