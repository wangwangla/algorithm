package com.sul.part2;

public class App {
    public static void main(String[] args) {
        LinkNode head = new LinkNode();
        head.data = -1;
        LinkNode current = head;
        for (int i = 0; i < 20; i++) {
            LinkNode linkNode = new LinkNode();
            linkNode.data = i;
            current.next = linkNode;
            current = current.next;
        }
        current = head;
        while (current!=null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("---------");
        current = head;
        while (current!=null){
            System.out.println(current.data);
            current = current.next;
        }

    }
}
