package com.zhuanti.silderwindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
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



    public int[] maxSlideWindow(int[] nums,int k){
        int arr[] = new int[nums.length-k+1];
        Deque<Integer> deque = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.peek()]<nums[i]){
                deque.pop();
            }
            deque.push(i);
            if (i>=k-1){
                arr[index++] = nums[deque.getLast()];
            }
            if (i-deque.getLast() >= k) deque.removeLast();
        }
        return arr;
    }

    public int[] xxx(int[] nums,int k){
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
//            if (!deque.isEmpty()&&deque.size()>=k)deque.removeLast();
            if (i-deque.getLast() >= k) {
                deque.removeLast();
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = {};
        int k = 0;
        MaxSlidingWindow window = new MaxSlidingWindow();
        int[] xxx = window.xxx(arr, k);
        for (int i : xxx) {
            System.out.println(i);
        }
    }
}
