package com.zhuanti.duizhan;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class GenMaxWindow {
    public static void main(String[] args) {

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
}
