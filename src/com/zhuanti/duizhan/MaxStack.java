package com.zhuanti.duizhan;

import java.util.Stack;

public class MaxStack {
    public void maxStack(int []arr){
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for (int i : arr) {
            while (!stack.isEmpty()&&stack.peek()>i){
                stack.pop();
            }
            stack.push(i);
        }
    }


    public void maxStack1(int []arr){
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty()&&stack.peek()>arr[i]){
                stack.pop();
            }
            stack.push(i);
        }
    }

    public void maxStack2(int []arr){
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int h[] = new int[arr.length+1];
        for (int i = 1; i <= arr.length; i++) {
            h[i] = arr[i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty()&&stack.peek()>arr[i]){
                int cur = stack.pop();
                int l = stack.peek();
                int r = i;
                max = Math.max(max,(r-l-1)*h[cur]);
            }
            stack.push(i);
        }
        System.out.println(max);
    }
}
