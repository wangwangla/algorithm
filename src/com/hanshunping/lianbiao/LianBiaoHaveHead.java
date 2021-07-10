package com.hanshunping.lianbiao;

//import sun.plugin2.applet.context.NoopExecutionContext;

/**
 * @author:28188
 * @date: 2021/6/30
 * @time: 22:02
 */
public class LianBiaoHaveHead {
    static class Node<T>{
        public T data;
        public Node<T> next;
        public Node(T data){
            this.data = data;
            next = null;
        }
    }


    private Node<Integer> head  = new Node(-1);
    public void addNode(int num){
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node<Integer> node = new Node(num);
        temp.next = node;
    }

    public void addNode(int num,int posi){
        //插入到第三个位置
        int xx = 0;
        Node node = head;
        while (node.next!=null){

            if (xx == posi){
                break;
            }
            node = node.next;
            xx++;
        }
        Node nodeNext = node.next;
        node.next = new Node(num);
        node.next.next = nodeNext;
    }

    public void editNodeVal(int value,int targetVlaue){
        Node<Integer> node = head;
        while (node.next!=null){
            node = node.next;
            if (value == node.data){
                node.data = targetVlaue;
                break;  //加上就是只修改第一次 出现的，不修改就是所有的都修改
            }
        }
    }

    public void deleteNode(int value){
        Node<Integer> node = head;
        while (node.next!=null){
            if (value == node.next.data){
                break;
            }
            node = node.next;
        }
        node.next = node.next.next;
    }

    public int findValueNum(){
        Node<Integer> node = head;
        int num = 0;
        while (node.next!=null) {
            num ++;
            node = node.next;
        }
        return num;
    }

    public int findIndex(int index) {
        Node<Integer> node = head;
        int num = 0;
        while (node.next!=null) {
            num ++;
            node = node.next;
        }
        if (num<index)return -1;
        index = num - index;
        num = 0;
        while (node.next!=null) {
            num ++;
            node = node.next;
            if (index == num){
                break;
            }
        }
        return node.data;
    }

    /**
     * 没写出来
     * @return
     */
    public Node fanzhuan(){
        if (head == null)return head;
        Node node = head.next;
        Node next = null;
        while (node.next != null) {
            next = node.next;
            head.next = node;
            Node node1 = node.next;
            node = next;
        }
        return null;
    }

    public static void main(String[] args) {
        LianBiaoHaveHead biao = new LianBiaoHaveHead();
        biao.addNode(0);
        biao.addNode(1);
        biao.addNode(2);
        biao.addNode(3);
        biao.addNode(4);
        biao.addNode(5);
        biao.addNode(6);
        biao.addNode(10,0);

//        修改
        biao.editNodeVal(5,11);
        System.out.println("===============================");
        biao.deleteNode(3);
        System.out.println("=======================");
        biao.fanzhuan();
        System.out.println("============");
    }
}
