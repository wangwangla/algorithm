package com.zhuanti.lianbiao;

public class Fanzhuan {
    public static void main(String[] args) {

    }

    class Node{
        int data;
        Node next;
    }
    public void rev(Node node){
        Node pre = null;
        Node next;
        Node curr = node;
        if (curr!=null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
    }


    public void rev1(Node node){
        Node curr = node;
        Node pre = null;
        if (curr!=null) {
            Node node1 = curr;
            curr = curr.next;
            curr.next = pre;
            pre = node1;
        }
    }
}
