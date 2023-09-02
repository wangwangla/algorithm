package com.algorithm._1_line._1_sequence;

import com.algorithm._1_line.node.Node;

/**
 * 顺序表  链表方式实现
 */
public class SequenceListLinked {
    private Node<Integer> head;
    //存在空头的链表
    public SequenceListLinked(){
        head = new Node<>();
    }

    /**
     * 头节点没有数据，从第二个节点开始加入
     * 存储但是需要知道上一个节点
     *
     * 创建出节点   前面我们链接谁   谁跟我后面
     * 如果是添加末尾，就无需关心
     * @param num
     */
    private void addData(int num){
        Node<Integer> addNode = new Node<>();
        addNode.data = num;
        Node temp = head;
        //走到结尾
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = addNode;
    }


    /**
     * 没有到结尾那么就一直寻找下一个
     */
    private void print(){
        Node x = head;
        while (x.next!=null){
            System.out.println(x.next.data);
            x = x.next;
        }
    }

    /**
     *删除末尾
     * 单链表，那么找到需要删除数据的前两个节点
     *
     */
    public void deleteRear(){
        Node x = head;
        if (x.next == null)return;
        //下一个不为null，下下为null
        while (x.next != null) {
            if (x.next.next == null){
                x.next = null;
                break;
            }
            x = x.next;
        }
    }

    //删除开头
    public void deleteStart(){
        Node x = head;
        if (x.next!=null){
            x.next = x.next.next;
        }else {
            System.out.println("no data delete!");
        }
    }

    public void insert(int i,int data){
        if (i<0)return;
        Node x = head;
        Node node = new Node();
        node.data = data;
        int index = 0;
        while (x.next != null) {
            if (index == i){
                break;
            }
            x = x.next;
            index ++;
        }
        if (x!=null){
            Node next = x.next;
            x.next = node;
            node.next = next;
        }
    }

//    public void inset(int data){
//        Node x = head;
//        while (x.next!=null){
//            x = x.next;
//        }
//        Node node = new Node();
//        node.data = data;
//        x.next = node;
//    }


    public static void main(String[] args) {
        SequenceListLinked sequence = new SequenceListLinked();
        sequence.addData(1);
        sequence.addData(3);
        sequence.addData(4);
        sequence.insert(4,5);
//        sequence.insert(0,1);
        sequence.deleteRear();
        sequence.deleteStart();
        sequence.print();
    }

}
