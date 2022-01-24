package com.labuladong.chapterthree;

import com.algorithm.binaryTree.ListNode;

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

    public static void main(String[] args) {
        String s = "abccba";
        for (int i = 0; i < s.length(); i++) {
            _391_LinkPailnd pailnd = new _391_LinkPailnd();
            System.out.println(pailnd.palindrome(s,0, i));
        }
    }
}
