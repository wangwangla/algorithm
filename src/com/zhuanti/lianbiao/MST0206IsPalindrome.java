package com.zhuanti.lianbiao;

import com.zhuanti.binaryTree.ListNode;

import java.util.ArrayList;

public class MST0206IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> builder = new ArrayList<>();
        while (head!=null){
            builder.add(head.val);
            head = head.next;
        }

        for (int i = 0; i < builder.size()/2; i++) {
            if (builder.get(i).equals(builder.get(builder.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
