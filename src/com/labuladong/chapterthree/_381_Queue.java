package com.labuladong.chapterthree;

import java.util.Deque;
import java.util.LinkedList;

public class _381_Queue {
    public int[] maxSlideWindow(int[] nums,int k){
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty()&&nums[i]>nums[stack.peekLast()]){
                stack.pop();
            }

            stack.push(i);
            if (i>=k-1){
                System.out.println(nums[stack.getLast()]);
            }
            if (i-stack.peekLast()>=k){
                stack.removeLast();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,3,-1,-3,5,3,6,7};
        _381_Queue queue = new _381_Queue();
        queue.maxSlideWindow(arr,3);
    }
}
