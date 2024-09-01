package com.sul.part2;

public class LinkUtils {
    private LinkNode head;

    public void createLink(){
        head = new LinkNode();
        head.data = -1;
        LinkNode current = head;
        for (int i = 0; i < 20; i++) {
            LinkNode linkNode = new LinkNode();
            linkNode.data = i;
            current.next = linkNode;
            current = current.next;
        }
    }

    public void println(LinkNode head){
        LinkNode current = head;
        while (current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void deleteNode(int value){
        LinkNode node = head;
        if (node == null){
            return;
        }
        while (node.next.data != value){
            node = node.next;
            if (node == null){
                break;
            }
        }

        if (node.next!=null) {
            LinkNode next = node.next.next;
            node.next = next;
        }
    }


    public void deleteNodes(int value){
        LinkNode node = head;
        if (node == null){
            return;
        }
        while (node!=null && node.next != null){
            if (node.next.data == value){
                LinkNode next = node.next.next;
                node.next = next;
            }else {
                node = node.next;
            }
        }
    }


    public LinkNode removeElements(LinkNode head, int val) {
        while(head!=null && head.data==val) {
            head = head.next;
        }
        LinkNode curr = head;
        while(curr!=null && curr.next !=null) {
            if(curr.next.data == val){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
    public void addNode(int vbv,int value){
        LinkNode node = head;
        if (node == null){
            return;
        }
        while (node.next.data != value){
            node = node.next;
            if (node.next == null){
                break;
            }
        }
        LinkNode newNode = new LinkNode();
        newNode.data = vbv;
        if (node.next!=null) {
            LinkNode next1 = node.next.next;
            node.next.next = newNode;
            newNode.next = next1;
        }else {
            node.next = newNode;
        }
    }

    public static void main(String[] args) {
        LinkUtils utils = new LinkUtils();
        utils.createLink();
//        utils.println(utils.head);
        utils.deleteNode(6);
//        utils.println(utils.head);
        utils.addNode(6,18);
//        utils.println(utils.head);

        utils.addNode(6,15);
        utils.removeElements(utils.head,3);
        utils.deleteNodes(6);
        utils.println(utils.head);

        utils.reverseList(utils.head);
    }

    public void reverseList(LinkNode node){
        LinkNode pre = null;
        LinkNode cur = node;
        LinkNode temp = null;
        while (cur!=null){
            //下一个节点
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
    }
}
