package com.zhuanti.lianbiao;

/**
 * 重新写一下
 */
public class Offer029Insert {
    class Node{
        public Node(int v){
            this.val = v;
            this.next = null;
        }
        public Node(int v,Node node){
            this.val = v;
        }
        private int val;
        private Node next;
    }
    public Node insert(Node head, int insertVal) {
        //本来就是null的，那么就创建一个指向自己变为一个环
        if (head == null){
            head = new Node(insertVal);
            head.next = head;
            return head;
        }
        Node cur = head;
        //如已经找到了最后一个，那就插入最后一个位置
        while (cur.next != head){
            if (cur.next.val < cur.val){
                if (cur.val <= insertVal){
                    break;
                }else if (cur.next.val > insertVal){
                    break;
                }
            }
            if (cur.val <= insertVal && cur.next.val >= insertVal) break;
            cur = cur.next;
        }
        Node node = new Node(insertVal, cur.next);
        cur.next = node;
        return head;
    }
}
