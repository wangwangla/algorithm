package com.rowoffer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 最小栈套路
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!deque.isEmpty() && temperatures[deque.peek()] > temperatures[i]){
                Integer pop = deque.pop();
            }
            deque.push(i);
        }
        return null;
    }
}
