package com.zhuanti.lianbiao;

import java.util.Stack;

public class Huiwen {
    class Node{
        private int num;
        private Node next;
    }

    public void test(Node head){
        Stack stack = new Stack();
        Node xx = head;
        while (xx!=null){
            stack.add(xx.num);
            xx = xx.next;
        }
        while (!stack.isEmpty()){
            if (stack.pop().num == xx.num){

            }
        }
    }
}
