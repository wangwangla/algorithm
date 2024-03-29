package com.shuati.letcode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _2_AddTwoNumbers {
    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    /**
     * 没看清题目，使用了前插，结果答案不对，
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode num = null;
        int temp = 0;
        while (temp1 != null&&temp2!=null){
            temp = temp1.val+temp2.val;
            if (num==null) {
                num = new ListNode(temp);
                num.next = null;
            }else {
                ListNode t1 = num;
                ListNode t2 = new ListNode(temp);
                t2.next = t1;
                num = t2;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if (temp1!=null){
            if (num==null) {
                num = new ListNode(temp1.val);
                num.next = null;
            }else {
                ListNode t1 = num;
                ListNode t2 = new ListNode(temp);
                t2.next = t1;
                num = t2;
            }
        }


        if (temp2!=null){
            if (num==null) {
                num = new ListNode(temp);
                num.next = null;
            }else {
                ListNode t1 = num;
                ListNode t2 = new ListNode(temp);
                t2.next = t1;
                num = t2;
            }
        }
        return num;

    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode num = null;
        int temp = 0;
        while (temp1 != null&&temp2!=null){
            temp = temp1.val+temp2.val;
            if (num==null) {
                num = new ListNode(temp);
                num.next = null;
            }else {
                while(num!=null){
                    num = num.next;
                }
                num = new ListNode(temp);
                num.next = null;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if (temp1!=null){
            if (num==null) {
                num = new ListNode(temp);
                num.next = null;
            }else {
                while(num!=null){
                    num = num.next;
                }
                num = new ListNode(temp);
                num.next = null;
            }
        }


        if (temp2!=null){
            if (num==null) {
                num = new ListNode(temp);
                num.next = null;
            }else {
                while(num!=null){
                    num = num.next;
                }
                num = new ListNode(temp);
                num.next = null;
            }
        }
        return num;

    }

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode num = null;
        int temp = 0;
        while (temp1 != null&&temp2!=null){
            temp = temp1.val+temp2.val;
            if (num==null) {
                num = new ListNode(temp);
                num.next = null;
            }else {
                ListNode num1 = num;
                while(num1.next!=null){
                    num1 = num1.next;
                }
                ListNode node = new ListNode(temp);
                node.next = null;
                num1.next = node;

            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if (temp1!=null){
            if (num==null) {
                num = new ListNode(temp);
                num.next = null;
            }else {
                ListNode num1 = null;
                while(num1!=null){
                    num1 = num1.next;
                }
                num1 = new ListNode(temp);
                num1.next = null;
            }
        }


        if (temp2!=null){
            if (num==null) {
                num = new ListNode(temp);
                num.next = null;
            }else {
                ListNode num1 = null;
                while(num1!=null){
                    num1 = num1.next;
                }
                num1 = new ListNode(temp);
                num1.next = null;
            }
        }
        return num;

    }

        public ListNode addTwoNumbers5(ListNode l1, ListNode l2) {
            int cJinwei = 0;
            int num1 = 0;
            int num2 = 0;
            int count=0;
            ListNode node = new ListNode(0);
            ListNode root = node;
            while ((l1!=null)||(l2 != null)) {
                num1=0;
                num2=0;
                if (l1 != null) {
                    num1 = l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    num2 = l2.val;
                    l2 = l2.next;
                }
                count=num1+num2+cJinwei;
                cJinwei = count /10;
                ListNode sumNode = new ListNode(count % 10);
                node.next = sumNode;
                node = sumNode;
            }
            if(cJinwei!=0){
                ListNode sumNode = new ListNode(cJinwei);
                node.next = sumNode;
                node = sumNode;
            }
            return  root.next;
        }


    public static ListNode addTwo(ListNode node1,ListNode node2){
        int jinwei = 0;
        ListNode newHead = new ListNode(0);
        ListNode temp1 = newHead;
        while (node1!=null | node2 != null){
//            if (node1==null){
//                while (node2!=null){
//                    ListNode listNode = new ListNode(node2.val+jinwei);
//                    jinwei = 0;
//                    newHead.next= listNode;
//                    node2 = node2.next;
//
//                }
//                break;
//            }

//            优化
//            if (node1==null){
//                newHead.next = node2;
//            }else{
//                newHead.next = node1;
//            }
            if (node1==null||node2==null) {
                newHead.next = node1 == null ? node2 : node1;
                break;
            }
//            if (node2 == null) {
//                while (node1!=null){
//                    ListNode listNode = new ListNode(node1.val+jinwei);
//                    jinwei = 0;
//                    newHead.next= listNode;
//                    node1 = node1.next;
//                }
//                break;
//            }

            int num1 = node1.val;
            int num2 = node2.val;
            node1 = node1.next;
            node2 = node2.next;
            int i = num1 + num2;
            ListNode listNode;
            if (i>=10){
                jinwei = 1;
                listNode = new ListNode(i-10);
            }else {
                listNode = new ListNode(jinwei + i);
                jinwei = 0;
            }
            newHead.next= listNode;
            newHead = newHead.next;
        }
        if (jinwei !=0){
            ListNode listNode = new ListNode(jinwei);
            newHead.next = listNode;
            newHead = newHead.next;
        }
        return temp1.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        ListNode head1 = node;
        node.next = new ListNode(4);
        node = node.next;
        node.next = new ListNode(3);

        ListNode node2 = new ListNode(5);
        ListNode head2 = node2;
        node2.next = new ListNode(6);
        node2 = node2.next;
        node2.next = new ListNode(4);
        ListNode listNode = addTwo(head1, head2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
