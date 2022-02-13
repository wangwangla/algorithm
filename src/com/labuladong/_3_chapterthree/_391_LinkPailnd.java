package com.labuladong._3_chapterthree;

import com.zhuanti.binaryTree.ListNode;

import java.util.Stack;

public class _391_LinkPailnd {
    public String palindrome(String s,int left,int right){
//        while (left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
//            left--;
//            right++;
//        }
//        if (right-left+1 - left - 1 <=0)return "";
//        return s.substring(left+1,right-left);
        while (left<right){
            if (s.charAt(left)!=s.charAt(right)){

            }else {
                left ++;
                right --;
            }
        }
        return "";
    }


    public boolean isPaildRome(String s){
        int left = 0;
        int right = s.length()-1;
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    private ListNode left;
    public boolean traverse(ListNode node){
        if (node == null)return true;
        boolean res = traverse(node.next);
        res = res&&node.val == left.val;
        left = left.next;
        return res;
    }


    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node1 = head;
        while (node1!=null) {
            stack.push(node1.val);
            node1 = node1.next;
        }
        while (head!=null){
            Integer pop = stack.pop();
            if (pop != head.val){
                return false;
            }
            head = head.next;
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }

    public boolean isPalindrome1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast !=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast == null) {
            //偶数
        }else {
            //奇数
        }
        return true;
    }

    private ListNode nnn;
    public boolean isp(ListNode node){
        if (node==null)return true;
        nnn = nnn.next;
        isp(node);
        System.out.println(node.val);
        if (nnn.val!=node.val){
            return false;
        }
        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        nnn = head;
        return isp(head);
    }

    public static void main(String[] args) {
        String s = "abccba";
        for (int i = 0; i < s.length(); i++) {
            _391_LinkPailnd pailnd = new _391_LinkPailnd();
            System.out.println(pailnd.palindrome(s,0, i));
        }
    }
}
