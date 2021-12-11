package com.zhuanti.lianbiao;

public class DeletePointData {
    static class Node{
        private int data;
        private Node next;
    }

    public static void main(String[] args) {
        DeletePointData d = new DeletePointData();
        DeletePointData.Node n1 = new DeletePointData.Node();
        n1.data = 1;
        DeletePointData.Node n2 = new DeletePointData.Node();
        n2.data = 2;
        DeletePointData.Node n3 = new DeletePointData.Node();
        n3.data = 3;
        DeletePointData.Node n4 = new DeletePointData.Node();
        n4.data = 4;
        DeletePointData.Node n5 = new DeletePointData.Node();
        n5.data = 5;
        DeletePointData.Node n6 = new DeletePointData.Node();
        n6.data = 6;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        d.deleteData(n1);
        System.out.println();
    }

    public void deleteData(Node n){
        Node head = n;
        Node no = n;
        int k =4;
        while (k>=0){
            head = head.next;
            k--;
        }
        while (head!=null){
            head = head.next;
            no = no.next;
        }
        no.next = no.next.next;
    }
}
