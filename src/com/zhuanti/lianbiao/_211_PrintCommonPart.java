package com.zhuanti.lianbiao;

public class _211_PrintCommonPart {
    class Node{
        private int num;
        private Node next;
    }

    public void printCommonPart(Node head1,Node head2){
        while (head1!=null&&head2!=null){
            if (head1.num > head2.num){
                head2 = head2.next;
            }else if (head1.num<head2.num){
                head1 = head1.next;
            }else {
                System.out.println(head1.num);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        System.out.println();
    }
}
