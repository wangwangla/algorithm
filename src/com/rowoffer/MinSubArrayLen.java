package com.rowoffer;

import java.util.Deque;
import java.util.LinkedList;

public class MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int count = 0;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            count += num;
            deque.push(num);
            while (!deque.isEmpty() && count >= target){
                Integer last = deque.getLast();
                if (count - last >= target) {
                    count -= last;
                    deque.removeLast();
                }else{
                    break;
                }
            }
        }
        if(count<target){
            return 0;
        }
        return deque.size();

        /**
         *
         */

    }



    public static void main(String[] args) {
        MinSubArrayLen len = new MinSubArrayLen();
//        15
//                [5,1,3,5,10,7,4,9,2,8]
        int arr[] = {5,1,3,5,10,7,4,9,2,8};
        len.minSubArrayLen(15,arr);
    }
}