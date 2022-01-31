package com.labuladong.chapterone;

import com.algorithm.binaryTree.ListNode;
import com.algorithm.line.LinkDemo;

public class _151_Point {
    /**
     * 快慢指针找出环
     * @param node
     * @return
     */
    boolean hasCycle(ListNode node){
        ListNode slowNode = node;
        ListNode fastNode = node;
        while (fastNode!=null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (fastNode == slowNode)return true;
        }
        return false;
    }

    /**
     * 第一个的位置
     * @param head
     * @return
     */
    public ListNode detactCycle(ListNode head){
        ListNode  fast = head;
        ListNode slow = head;
        while (fast!=null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = head;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //找中点  分为奇数和偶数
    public ListNode mid(ListNode head){
        if (head==null)return null;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return null;
    }

    public ListNode kNum(ListNode root){
        if (root == null)return null;
        ListNode fast = root;
        ListNode slow = root;
        int k=1;
        while (k-->0){
            fast = fast.next;
        }
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public int binarySearcch(int []nums,int target){
        int left = 0;
        int right = nums.length - 1;
        while (left<=right){
            int mid = (left + right) >> 1;
            if (nums[left] == target){
                return mid;
            }else if (nums[mid] > target){
                right -- ;
            }else {
                left ++;
            }
        }
        return -1;
    }

    public void reArr(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right++;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3); //偶数   3
        ListNode node4 = new ListNode(4); //奇数   4
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        _151_Point point = new _151_Point();
        point.mid(node1);
    }
}
