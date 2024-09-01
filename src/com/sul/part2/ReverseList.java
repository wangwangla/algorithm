package com.sul.part2;

public class ReverseList {
    public void reverseList(LinkNode node){
        LinkNode temp = node;
        LinkNode tempHead = new LinkNode();
        while (temp!=null){
            LinkNode next = tempHead.next;
            tempHead.next = temp;
            tempHead.next.next = next;
            temp = temp.next;
        }
    }
}
