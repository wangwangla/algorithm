package com.zhuanti.lianbiao;

public class _221_RemoveKNode {
    class Node{
        private int num;
        private Node next;
    }

    public Node removeLastK(int k,Node head){
        if (head == null || k<1){
            return head;
        }
        Node cur = head;
        while (k>0&&cur!=null){
            k--;
            cur = cur.next;
        }
        Node newCur = head;
        while (cur!=null){
            newCur = newCur.next;
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }

}
