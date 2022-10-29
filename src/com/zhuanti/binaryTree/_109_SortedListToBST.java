package com.zhuanti.binaryTree;

public class _109_SortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        return build(head,null);
    }

    public TreeNode build(ListNode left,ListNode right){
        if (left == right){
            return null;
        }
        ListNode mid = getMid(left, right);
        TreeNode root = new TreeNode(mid.val);
        root.left = build(left,mid);
        root.right = build(mid.next,right);
        return root;
    }

    public ListNode getMid(ListNode left,ListNode right){
        ListNode slowNode = left;
        ListNode fastNode = left;
        while (fastNode!=right||fastNode.next != null){
            fastNode = fastNode.next;
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }
}
