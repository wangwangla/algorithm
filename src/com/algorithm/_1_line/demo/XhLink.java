package com.algorithm._1_line.demo;

import com.algorithm._1_line.node.Node;

public class XhLink {
    private Node frist=null;
    public void create(int num){
        Node node = null;
        for (int i = 0; i < num; i++) {
            Node boy = new Node(i);
            if (i == 0){
                frist = boy;
                frist.next = frist;
                node = frist;
            }else {
                node.next = boy;
                boy.next = frist;
                node = boy;
            }
        }
    }

    public int countNum(int startNo,int num){
        Node helper = frist;

        while (helper.next != frist){
            helper = helper.next;
        }

        for (int i = 0; i < startNo - 1; i++) {
            frist = frist.next;
            helper = helper.next;
        }

        while (helper != frist){
            for (int i = 0; i < num; i++) {
                frist = frist.next;
                helper = helper.next;
            }
            System.out.println();
            frist = frist.next;
            helper.next = frist;
        }

        return 0;
    }
}
