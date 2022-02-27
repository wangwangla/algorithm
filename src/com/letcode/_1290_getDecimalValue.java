package com.letcode;

import com.zhuanti.binaryTree.ListNode;

import java.math.BigDecimal;

public class _1290_getDecimalValue {
    public int getDecimalValue(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while (head != null) {
            builder.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(builder.toString(),2);
    }

    public static void main(String[] args) {
        String str = "111";
        System.out.println(Integer.parseInt(str, 2));
    }
}
