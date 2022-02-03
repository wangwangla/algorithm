package com.zhuanti.duizhan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class _161_GenMaxWindow {
    public static void main(String[] args) {
        int[] arr={4,3,5,4,3,3,6,7};
        _161_GenMaxWindow genMaxWindow = new _161_GenMaxWindow();
        genMaxWindow.getWindowMax(arr);
    }

    public void maxWindow(int arr[]){
        int window = 3;
        Stack<Integer> stack = new Stack<>();
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if (result.peekFirst()>i - window + 1){
                result.remove(result.peekFirst());
            }
            int i1 = arr[i];
            if (stack.isEmpty()){
                stack.add(i);
            }else {
                //最大值放第一个
                while (!stack.isEmpty() &&  stack.peek()<i1) {
                    stack.pop();
                }
                stack.add(i);
            }
            if (i>window - 1){
                result.add(arr[stack.firstElement()]);
            }
        }

//        12 1 4 5
    }

    public void getWindowMax(int[] arr){
        int window = 3;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            while (!stack.isEmpty() && arr[stack.peek()] < i1){
                stack.pop();
            }
            stack.push(i);
            if (i>=window-1){
                System.out.println(arr[stack.firstElement()]);
            }
            if (i-stack.firstElement()>=window-1){
                stack.remove(0);
            }
        }
    }
}
