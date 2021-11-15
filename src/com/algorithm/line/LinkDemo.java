package com.algorithm.line;

public class LinkDemo {
    private class Node<T>{
        private T t;
        private Node next;
        public Node(T t, Node node){
            this.t = t;
            this.next = node;
        }
    }

    private Node head;
//    node  size
    public int num(){
        Node temp = head;
        int num = 0;
        while (temp!=null) {
            num ++;
            temp = temp.next;
        }
        return num;
    }

    public void find(int i){
//        找出倒数第i个节点
        Node temp = head;
        int xx = 0;
        Node man = head;
        while (temp != null){
            temp = temp.next;
            xx ++;
            if (xx >= i){
                man = man.next;
            }
        }
        System.out.println(man.t);
    }

    public void xuanzhuan(){
        //前插法
        Node temp = head;
        Node t = head;
        while (t!=null){

            t = t.next;

        }
    }
}
