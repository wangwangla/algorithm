package com.zhuanti.silderwindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
//        ArrayList<Integer> arrayList = new ArrayList();
        int arr[] = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty()&&nums[deque.peek()]<nums[i]){
                deque.pop();
            }
            deque.push(i);
            if (i>=k-1) {
                arr[index++] = nums[deque.getLast()];
            }
            if (i - deque.getLast()>=k)deque.removeLast();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,-1};
        int k = 1;
        MaxSlidingWindow window = new MaxSlidingWindow();
        window.maxSlidingWindow(arr,k);
    }
}
