package com.offer.rowoffer;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * 请根据每日 气温 列表 temperatures ，重新生成一个列表，要求其对应位置的输出为：
 * 要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 *
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> deque = new LinkedList<>();
        int xx[] = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!deque.isEmpty() && temperatures[deque.peek()] < temperatures[i]){
                Integer pop = deque.pop();
                xx[pop] = i - pop;
            }
            deque.push(i);
        }
        return xx;
    }

    public int[] dandiaozhanMoban(int[] arr) {
        Deque<Integer> deque = new LinkedList<>();
        //存储结果
        int xx[] = new int[arr.length];
        ///遍历所有元素
        for (int i = 0; i < arr.length; i++) {
            //条件满足就一直执行while操作
            while (!deque.isEmpty() && arr[deque.peek()] < arr[i]){
                Integer pop = deque.pop();
                xx[pop] = i - pop;
            }
            deque.push(i);
        }
        return xx;
    }


    public static void main(String[] args) {
        int arr[] = {73,74,75,71,69,72,76,73};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        dailyTemperatures.dailyTemperatures(arr);
    }
}
