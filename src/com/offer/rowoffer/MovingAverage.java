package com.offer.rowoffer;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    /** Initialize your data structure here. */
    private int windowLength = 0;
    private Queue<Integer> queue;
    public MovingAverage(int size) {
        this.windowLength = size;
        queue = new LinkedList<>();
    }
    private int count = 0;

    public double next(int val) {
        queue.offer(val);
        count += val;
        if (queue.size()>windowLength){
            Integer poll = queue.poll();
            count-=poll;
        }
        double xx = count*1.0 / queue.size();
        return xx;
    }

    public static void main(String[] args) {
        MovingAverage average = new MovingAverage(3);
        System.out.println(average.next(1));
        System.out.println(average.next(10));
        System.out.println(average.next(3));
        System.out.println(average.next(5));
    }
}
