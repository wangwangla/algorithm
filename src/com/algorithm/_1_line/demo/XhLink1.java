package com.algorithm._1_line.demo;

import com.algorithm._1_line.node.Node;

public class XhLink1 {
    private Node frist;
    //创建
    public void create(int num){
        Node temp = null;
        for (int i = 0; i < num; i++) {
            Node boy = new Node(i);
            if (i == 0){
                frist = boy;
                frist.next = frist;
                temp = frist;
            }else {
                temp.next = boy;
                temp = temp.next;
                temp.next = frist;
            }
        }
    }

    public void count(int startNo,int count){
        Node helper = frist;
        while (helper.next != frist){
            helper = helper.next;
        }
        for (int i = 0; i < startNo; i++) {
            helper = helper.next;
            frist = frist.next;
        }
        while (frist!=helper){
            for (int i = 0; i < count; i++) {
                frist = frist.next;
                helper = helper.next;
            }
            frist = frist.next;
            helper.next = frist;
        }
    }

}
