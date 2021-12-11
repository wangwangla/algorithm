package com.zhuanti.lianbiao;

/**
 * 打印公共部分
 */
public class CommonPart {
    class Node{
        private int data;
        private Node next;
    }
    public static void main(String[] args) {

    }

    public void common(Node node1 ,Node node2){
        while (node1!=null && node2!=null){
            if (node1.data > node2.data){
                node2 = node2.next;
            }else if (node1.data<node2.data){
                node1 = node1.next;
            }else {
                System.out.println(node1.data +"   "+node2.data);
                node1 = node1.next;
                node2 = node2.next;
            }
        }
    }
}
