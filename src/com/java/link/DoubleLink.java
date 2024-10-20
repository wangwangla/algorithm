package com.java.link;

public class DoubleLink {
    private class Node {
        public Integer element;
        public Node next;
        public Node prev;

        public Node(Integer e) {
            element = e;
            next = null;
            prev = null;
        }
    }

    private Node header;
    private Node trailer;
    private int count;

    public DoubleLink(){
        header = new Node(null);
        trailer = new Node(null);
    }
}
