package com.labuladong.chapterthree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 找出数组后面值比当前值的值
 *
 * 21243
 * 2 --> 4
 * 1 --> 2
 * 2 --> 4
 * 4 --> -1
 * 3 --> -1
 */
public class _371_Stack {
    public ArrayList<Integer> nextGreater(int num[]){
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        for (int i = num.length-1; i >= 0; i--) {
            while (!deque.isEmpty()&&deque.peek() <= num[i]){
                deque.pop();
            }
            ans.add(deque.isEmpty()?-1:deque.peek());
            deque.push(num[i]);
        }
        return ans;
    }


    public ArrayList<Integer> nextGreater1(int num[]){
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        int arr[]  = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            while (!deque.isEmpty()&&num[deque.peek()] < num[i]){
                Integer pop = deque.pop();
                ans.add(num[i]);
                arr[pop] = num[i];
            }
            deque.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,2,4,3};
        _371_Stack stack = new _371_Stack();
//        stack.nextGreater1(arr);
        int ae[] = {73,74,75,71,69,72,76,73};
        stack.nextGreater1(ae);
    }

}
